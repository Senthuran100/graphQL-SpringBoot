import { gql } from "@apollo/client";

export const GET_AllUsers = gql`
  query {
    getAllUsers{
        userId
        firstName
        lastName
        address
             post {
          postName
          postId
          
        }
      }
  }
`;