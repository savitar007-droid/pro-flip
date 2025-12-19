import { useEffect, useState } from "react";
import api from "../api";

export default function Clients() {
  const [clients, setClients] = useState([]);

  useEffect(() => {
    api.get("/clients").then(res => setClients(res.data));
  }, []);

  return (
    <section>
      <h2>Happy Clients</h2>
      {clients.map(c => (
        <div key={c.id}>
          <img src={`http://localhost:8080/${c.image}`} width="100" />
          <p>{c.description}</p>
          <h4>{c.name}</h4>
          <span>{c.designation}</span>
        </div>
      ))}
    </section>
  );
}
