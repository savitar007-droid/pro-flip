import { useState } from "react";
import api from "../api";

export default function ContactForm() {
  const [form, setForm] = useState({});

  const submit = () => {
    api.post("/contact", form);
    alert("Contact submitted");
  };

  return (
    <section>
      <h2>Contact</h2>
      <input placeholder="Name" onChange={e => setForm({...form, fullName:e.target.value})}/>
      <input placeholder="Email" onChange={e => setForm({...form, email:e.target.value})}/>
      <input placeholder="Mobile" onChange={e => setForm({...form, mobile:e.target.value})}/>
      <input placeholder="City" onChange={e => setForm({...form, city:e.target.value})}/>
      <button onClick={submit}>Submit</button>
    </section>
  );
}
