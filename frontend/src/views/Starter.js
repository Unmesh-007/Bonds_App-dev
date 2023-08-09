import { Col, Row } from "reactstrap";
import SalesChart from "../components/dashboard/SalesChart";
import { Piechart } from "../components/dashboard/Piechart";
import Feeds from "../components/dashboard/Feeds";
import ProjectTables from "../components/dashboard/ProjectTable";
import TopCards from "../components/dashboard/TopCards";
import Blog from "../components/dashboard/Blog";
import bg1 from "../assets/images/bg/bg1.jpg";
import bg2 from "../assets/images/bg/bg2.jpg";
import bg3 from "../assets/images/bg/bg3.jpg";
import bg4 from "../assets/images/bg/bg4.jpg";
import MuiTable from "../components/dashboard/muitable";
import axios from "axios";

// import { useEffect } from "react";
import React, { useEffect, useState } from "react";

const BlogData = [
  // {
  //   image: bg1,
  //   title: "This is simple blog",
  //   subtitle: "2 comments, 1 Like",
  //   description:
  //     "This is a wider card with supporting text below as a natural lead-in to additional content.",
  //   btnbg: "primary",
  // },
  // {
  //   image: bg2,
  //   title: "Lets be simple blog",
  //   subtitle: "2 comments, 1 Like",
  //   description:
  //     "This is a wider card with supporting text below as a natural lead-in to additional content.",
  //   btnbg: "primary",
  // },
  // {
  //   image: bg3,
  //   title: "Don't Lamp blog",
  //   subtitle: "2 comments, 1 Like",
  //   description:
  //     "This is a wider card with supporting text below as a natural lead-in to additional content.",
  //   btnbg: "primary",
  // },
  // {
  //   image: bg4,
  //   title: "Simple is beautiful",
  //   subtitle: "2 comments, 1 Like",
  //   description:
  //     "This is a wider card with supporting text below as a natural lead-in to additional content.",
  //   btnbg: "primary",
  // },
];

const baseURL = "#"

const Starter = () => {
  const [securities, setSecurities] = useState(null);
  useEffect(() => {
    axios.get(baseURL).then((response) => {
      setSecurities(response.data);
    });
  }, []);
  return (
    <div>
      {/***Top Cards***/}
      <Row>
        <Col sm="6" lg="3">
          <TopCards
            bg="bg-light-success text-success"
            title="Profit"
            subtitle="Total Books Under Management"
            earning="35"
            icon="bi bi-wallet"
          />
        </Col>
        <Col sm="6" lg="3">
          <TopCards
            bg="bg-light-danger text-danger"
            title="Refunds"
            subtitle="Total Securities Under Management"
            earning="104"
            icon="bi bi-file-earmark-medical"
          />
        </Col>
        <Col sm="6" lg="3">
          <TopCards
            bg="bg-light-warning text-warning"
            title="New Project"
            subtitle="Total Trades Under Management"
            earning="456"
            icon="bi bi-graph-up-arrow"
          />
        </Col>
        <Col sm="6" lg="3">
          <TopCards
            bg="bg-light-info text-into"
            title="Sales"
            subtitle="Total Post Maturity Securities"
            earning="210"
            icon="bi bi-calendar2-check"
          />
        </Col>
      </Row>
      {/***Sales & Feed***/}
      <Row>
        <Col sm="6" lg="6" xl="6" xxl="6">
          <Feeds />
        </Col>
        <Col sm="6" lg="6" xl="6" xxl="6">
          {/* <SalesChart /> */}
          <Piechart />
        </Col>
      </Row>
      {/***Table ***/}
      <Row>
        <Col lg="12">
          {/* <ProjectTables /> */}
          {<MuiTable />}
        </Col>
      </Row>
      {/***Blog Cards***/}
      <Row>
        {BlogData.map((blg, index) => (
          <Col sm="6" lg="6" xl="3" key={index}>
            <Blog
              image={blg.image}
              title={blg.title}
              subtitle={blg.subtitle}
              text={blg.description}
              color={blg.btnbg}
            />
          </Col>
        ))}
      </Row>
    </div>
  );
};

export default Starter;
