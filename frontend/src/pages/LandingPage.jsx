import Projects from "../components/Projects";
import Clients from "../components/Clients";
import ContactForm from "../components/ContactForm";
import Newsletter from "../components/Newsletter";

export default function LandingPage() {
  return (
    <>
      <h1>Landing Page</h1>
      <Projects />
      <Clients />
      <ContactForm />
      <Newsletter />
    </>
  );
}
