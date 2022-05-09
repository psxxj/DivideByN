import React, { useState } from "react";
import { Link } from "react-router-dom";
import { users } from "./users";
import personSrc from "../img/person.png";
import { travelTitle } from "./StartPage";
var eventList = [
  {
    place: "newEvent",
    name: "me",
    price: "101010",
    date: "2022-02-28",
    participants: ["sungjun", "haeun", "jangwon", "yooseung"],
  },
  {
    place: "place",
    name: "name",
    price: "price",
    date: "2021-01-01",
    participants: [
      "sungjun",
      "haeun",
      "jangwon",
      "yooseung",
      "doyoon",
      "heejeong",
    ],
  },
];

function CreateEvent() {
  var payer = [];
  var participants = users.map((user) => user.name);
  console.log(participants);
  var place;
  var price;
  var date;

  function CreateUserIcon({ user }) {
    const [participate, setParticipate] = useState("participate");
    const [nameColor, setNameColor] = useState("green");
    const onClickIcon = () => {
      if (participate === "participate") {
        setParticipate("no");
        setNameColor("black");
        const index = participants.indexOf(user.name);
        participants.splice(index, 1);
      } else if (participate === "no") {
        setParticipate("payer");
        setNameColor("blue");
        participants.push(user.name);
        payer.push(user.name);
      } else if (participate === "payer") {
        setParticipate("participate");
        setNameColor("green");
        payer.pop(user.name);
      }
      console.log(participants);
    };

    return (
      <div className="user" onClick={onClickIcon}>
        <img className="icon" src={personSrc} alt="profile" />
        <br />
        <span style={{ color: nameColor }}>{user.name}</span>
      </div>
    );
  }

  const onClickSubmit = (e) => {
    place = document.querySelector("#place").value;
    price = document.querySelector("#price").value;
    date = document.querySelector("#date").value;
    if (place === "") {
      alert("장소를 입력하세요");
      e.preventDefault();
    } else if (price === "") {
      alert("액수를 입력하세요");
      e.preventDefault();
    } else if (date === "") {
      alert("날짜를 입력하세요");
      e.preventDefault();
    } else if (payer.length === 1) {
      console.log("okay");
      const newEvent = {
        place: place,
        name: payer[0],
        price: price,
        date: date,
        participants: participants,
      };
      console.log(participants);
      eventList.push(newEvent);
      const sortedEventList = eventList.sort(function (a, b) {
        return a.date - b.date;
      });
      const sortedUsers = users.sort(function (a, b) {
        return a.spent - b.spent;
      });
      console.log(sortedUsers);
      eventList = sortedEventList;
      console.log(eventList);
    } else if (payer.length > 1) {
      alert("결제자는 한 명이어야 합니다\nError: Too Many Payers");
      e.preventDefault();
    } else if (payer.length === 0) {
      alert("결제자는 한 명이어야 합니다\nError: No Payer");
      e.preventDefault();
    }
  };

  return (
    <div>
      <div>
        <input
          placeholder="장소"
          type="text"
          id="place"
          name="place"
          value={place}
          size="5"
        />
        <input
          placeholder="가격"
          type="text"
          id="price"
          name="price"
          value={price}
          size="5"
        />
        <input
          placeholder="날짜"
          type="date"
          id="date"
          name="date"
          value={date}
          size="5"
        />
      </div>
      <div>
        {users.map((user) => (
          <CreateUserIcon user={user} key={user.name} />
        ))}
      </div>
      <Link to={`/${travelTitle}`} onClick={onClickSubmit}>
        <button>이벤트 추가</button>
      </Link>
    </div>
  );
}

export { CreateEvent, eventList };