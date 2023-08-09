import MUIDataTable from "mui-datatables"
// es6 syntax
import fetch from 'node-fetch';
import { json } from "react-router-dom";

const columns = ["id", "ISIN", "CUSIP", "Issuer", "MaturityDate", "Coupon", "Type", "FaceValue", "Status"]
const data = [
  [1, "US1234567890", "12345678", "Issuer A", "2030-12-31", 5.00, "Corporate", 1000.00, "Active"],
  [2, "US0987654321", "98765432", "Issuer B", "2035-06-30", 4.50, "Government", 500.00, "Active"],
  [3, "US5678901234", "56789012", "Issuer C", "2040-04-15", 3.75, "Municipal", 750.00, "Active"],
  [4, "US5555555555", "55555555", "Issuer D", "2025-08-15", 6.25, "Corporate", 800.00, "Active"],
];


const options = {
  filterType: 'checkbox',
};

const MuiTable = (props) => {

  const url = `http://localhost:8080/api/Security`;
  const options = {
    method: 'GET',

  };
  // promise syntax
  fetch(url, options)
    .then(res => res.json()).then(json => console.log(json))
    .catch(err => console.error('error:' + err));

  // async await syntax
  // try {
  // const res = await fetch(url, options);
  // const json = await res.json();
  // console.log(json);
  // } catch (err) {
  // console.log(err);
  // }
  return (
    <h2></h2>
  )
}
export default MuiTable;