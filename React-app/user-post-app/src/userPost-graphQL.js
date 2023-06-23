import { gql } from "@apollo/client";

export const GET_AllUsers = gql`
  query {
    getAllUsers{
        userId
        firstName
        lastName
        address
      }
  }
`;

export const CREATE_NewUser = gql`
  mutation ($firstName: String!, $lastName: String!, $address: String) {
    addUser(firstName: $firstName, lastName: $lastName, address: $address) {
      userId
      firstName
      address
      lastName
    }
  }
`;