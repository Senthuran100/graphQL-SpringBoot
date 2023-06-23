import { Col, Container, Row, Form, Button } from "react-bootstrap";
import { useRef, useState } from "react";
import { CREATE_NewUser } from "../userPost-graphQL";
import { useMutation } from "@apollo/client";
import { useNavigate } from "react-router-dom";

const AddUser = () => {
    const [firstName, setFirstName] = useState('');
    const [lastName,setLastName] = useState('');
    const [address,setAddress] = useState('');
    const navigate = useNavigate();

    const [addUser] = useMutation(CREATE_NewUser);

    const addUserHandler = () => {
        console.log('FirstName',firstName);
        //  addUser({
        //     variables: {
        //         firstName:firstName.current.valueOf,
        //         lastName:lastName.current.valueOf,
        //         address:address.current.valueOf,
        //     },
        //  }).then(() => {
        //     navigate("/");
        //   });   
    };

    return (
        <>
          <Container className="mt-2">
            <Row>
              <Col className="col-md-8 offset-md-2">
                <legend>Add User</legend>
                <Form.Group className="mb-3">
                  <Form.Label>First Name</Form.Label>
                  {console.log('ddd',firstName)}
                  <Form.Control type="text" onChange={(e)=>setFirstName(e.target.value)}/>
                </Form.Group>
                <Form.Group className="mb-3" >
                  <Form.Label>Last Name</Form.Label>
                  <Form.Control type="text" onChange={(e)=>setLastName(e.target.value)} />
                </Form.Group>
                <Form.Group className="mb-3" >
                  <Form.Label>Address</Form.Label>
                  <Form.Control type="text" onChange={(e)=>setAddress(e.target.value)} />
                </Form.Group>
                <Button variant="primary" type="button" onClick={addUserHandler}>
                  Add
                </Button>
              </Col>
            </Row>
          </Container>
        </>
      );
  };
  export default AddUser;