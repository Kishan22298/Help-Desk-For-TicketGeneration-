import axios from "axios";

const base_url = "http://localhost:8080/api/ai";

export const sendMessagesToServer = async (message, conversationId )=> {
  const response = await axios.post(`${base_url}/response`, message, {
    headers: {
      conversationId: conversationId,
    },
  });

  return response.data;
};