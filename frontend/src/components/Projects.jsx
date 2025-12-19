import { useEffect, useState } from "react";
import api from "../api";

export default function Projects() {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    api.get("/projects").then(res => setProjects(res.data));
  }, []);

  return (
    <section>
      <h2>Our Projects</h2>
      {projects.map(p => (
        <div key={p.id}>
          <img src={`http://localhost:8080/${p.image}`} width="200" />
          <h3>{p.name}</h3>
          <p>{p.description}</p>
          <button>Read More</button>
        </div>
      ))}
    </section>
  );
}
