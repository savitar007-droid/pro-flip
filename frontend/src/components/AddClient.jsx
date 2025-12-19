import { useState } from "react";
import api from "../api";

export default function AddClient() {
  const [data, setData] = useState({});

  const submit = () => {
    const formData = new FormData();
    formData.append("name", data.name);
    formData.append("description", data.description);
    formData.append("designation", data.designation);
    formData.append("image", data.image);

    api.post("/clients", formData);
    alert("Client added");
  };

  return (
    <>
      <h2>Add Client</h2>
      <input placeholder="Name" onChange={e => setData({...data, name:e.target.value})}/>
      <input placeholder="Description" onChange={e => setData({...data, description:e.target.value})}/>
      <input placeholder="Designation" onChange={e => setData({...data, designation:e.target.value})}/>
      <input type="file" onChange={e => setData({...data, image:e.target.files[0]})}/>
      <button onClick={submit}>Add</button>
    </>
  );
}
