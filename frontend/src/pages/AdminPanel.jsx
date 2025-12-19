import AddProject from "../components/AddProject";
import AddClient from "../components/AddClient";
import api from "../api";
import { useEffect, useState } from "react";

export default function AdminPanel() {
  const [contacts, setContacts] = useState([]);
  const [subs, setSubs] = useState([]);

  useEffect(() => {
    api.get("/contact").then(res => setContacts(res.data));
    api.get("/subscribe").then(res => setSubs(res.data));
  }, []);

  return (
    <>
      <h1>Admin Panel</h1>

      <AddProject />
      <AddClient />

      <h2>Contacts</h2>
      {contacts.map(c => (
        <p key={c.id}>{c.fullName} - {c.email}</p>
      ))}

      <h2>Subscribers</h2>
      {subs.map(s => (
        <p key={s.id}>{s.email}</p>
      ))}
    </>
  );
}
