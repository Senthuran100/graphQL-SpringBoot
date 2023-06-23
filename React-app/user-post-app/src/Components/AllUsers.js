import { useQuery } from "@apollo/client";
import { useEffect, useState } from "react";
import { GET_AllUsers } from "../userPost-graphQL";
import Card from "react-bootstrap/Card";
import Col from "react-bootstrap/Col";
import Row from "react-bootstrap/Row";
import { Container } from "react-bootstrap";

const AllUsers = () => {

  const [allUsersData, setAllUsersData] = useState([]);
  const { data } = useQuery(GET_AllUsers, {
    fetchPolicy: "no-cache",
  });

  useEffect(() => {
    if (data?.getAllUsers) {
      setAllUsersData(data.getAllUsers);
    }
  }, [data]);

  return (
    <>
      <Container className="mt-2">
        <Row xs={1} md={3} className="g-4">
          {allUsersData.map((user) => (
            <Col key={user.userId}>
              <Card>
                <Card.Body>
                  <Card.Title>{user.firstName}{" "}{user.lastName}</Card.Title>
                  <Card.Text>{user.address}</Card.Text>
                </Card.Body>
              </Card>
            </Col>
          ))}
        </Row>
      </Container>
    </>
  );
};
export default AllUsers;