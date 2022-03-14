import { React, useState } from "react";
import { Link } from "react-router-dom";
var travelTitle;
const StartPage = () => {
  const [title, setTitle] = useState("");

  const onChange = (e) => {
    const { value } = e.target;
    setTitle(value);
    travelTitle = title;
  };
  const onClickSubmit = (e) => {
    if (title === "") {
      alert("제목을 입력하세요");
      e.preventDefault();
    }
    travelTitle = title;
    console.log(title);
  };
  return (
    <div>
      <h1 id="headers">Create New Travel</h1>
      <input onChange={onChange} placeholder="Travel Name" />
      <Link to={`/${title}`}>
        <button style={{ textDecoration: "none" }} onClick={onClickSubmit}>
          Submit
        </button>
      </Link>
    </div>
  );
};

export { travelTitle, StartPage };
