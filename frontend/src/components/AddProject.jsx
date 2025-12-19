import { useState } from "react";
import api from "../api";

export default function AddProject() {
  const [data, setData] = useState({});

  const submit = () => {
    const formData = new FormData();
    formData.append("name", data.name);
    formData.append("description", data.description);
    formData.append("image", data.image);

    api.post("/projects", formData);
    alert("Project added");
  };

  return (
    <>
      <h2>Add Project</h2>
      <input placeholder="Name" onChange={e => setData({...data, name:e.target.value})}/>
      <input placeholder="Description" onChange={e => setData({...data, description:e.target.value})}/>
      <input type="file" onChange={e => setData({...data, image:e.target.files[0]})}/>
      <button onClick={submit}>Add</button>
    </>
  );
}
