import { Container } from "react-bootstrap";
import Navbar from "react-bootstrap/Navbar";

const Layout = ({ children }) => {
  return (
    <>
      <Navbar bg="primary" variant="dark" style={{ justifyContent: "center" }}>
        <Navbar.Brand href="#" >User Post</Navbar.Brand>
      </Navbar>
      <Container>{children}</Container>
    </>
  );
};
export default Layout;