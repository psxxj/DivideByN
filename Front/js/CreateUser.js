import React from "react";
import { Link } from "react-router-dom";
import { travelTitle } from "./StartPage";

const CreateUser = () => {
  const onClickSubmit = () => {};
  return (
    <div>
      <h1 id="headers">Create User</h1>
      <input placeholder="name" />
      <input placeholder="account" />
      <Link to={`/${travelTitle}`}>
        <button onClick={onClickSubmit}>Submit</button>
      </Link>
    </div>
  );
};

export default CreateUser;
