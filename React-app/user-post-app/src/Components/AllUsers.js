import { useQuery } from "@apollo/client";
import { useEffect, useState } from "react";
import {GET_AllUsers}  from "../userPost-graphQL";

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

    </>
  );
};
export default AllUsers;