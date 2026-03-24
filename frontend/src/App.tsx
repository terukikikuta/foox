import React, { useState } from 'react';
import axios from 'axios';


function App() {
  const [userName, setUserName] = useState('');
  const [passWord, setPassWord] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    const userInfo = {
      userName,
      passWord
    }

    try {
      const response = await axios.post('http://localhost:8080/api/login', userInfo);
      console.log(response.data);
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div>

      <h1>ログイン</h1>
      <form onSubmit={handleSubmit}>
        <input type="text" onChange={(e) => setUserName(e.target.value)}></input><br />
        <input type="password"  onChange={(e) => setPassWord(e.target.value)}></input><br />
        <input type="submit" value="ログイン"></input>
      </form>

    </div>
  )
}

export default App