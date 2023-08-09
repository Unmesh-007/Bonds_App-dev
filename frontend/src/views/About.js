import React from 'react';
import { Row, Col, CardTitle, Button, CardSubtitle, Card } from 'reactstrap';
import ComponentCard from '../components/ComponentCard';
import bond from "./bond.jpeg";


const About = () => {
  const features = [
    {
      title: 'Portfolio Tracking',
      desc: 'Users can add and track their bond holdings, view current valuations, and monitor changes in their portfolios value over time.',
      icon: 'bi-vinyl',
    },
    {
      title: 'Alert and Notifications',
      desc: 'Customizable alerts for price changes, coupon payments, maturity dates, and other significant events related to the users bond holdings.',
      icon: 'bi-umbrella',
    },
    {
      title: 'Research and Analytics',
      desc: 'Access to bond data, ratings, historical performance, and market news to aid users in making informed investment decisions.',
      icon: 'bi-lock',
    },
    {
      title: 'Trade Execution',
      desc: 'Integration with brokerage accounts to facilitate bond trading, buying, selling, and switching between different securities.',
      icon: 'bi-brightness-high',
    },
    {
      title: 'Secure Access',
      desc: 'Robust authentication and encryption to ensure the security of user data and account access.',
      icon: 'bi-gear',
    },
    {
      title: 'Customer Support',
      desc: 'Access to customer support or chatbots to answer user queries and provide assistance when needed.',
      icon: 'bi-star',
    },
    // {
    //   title: 'Clean & Modern Design',
    //   desc: 'Beautifully crafted, clean & modern designed admin theme with 5 different demos & light - dark versions.',
    //   icon: 'bi-brush',
    // },
    // {
    //   title: 'Easy Navigation',
    //   desc: 'Carefully crafted, clean, smart & easy theme navigation with collapsible option.',
    //   icon: 'bi-segmented-nav',
    // },
    // {
    //   title: 'No jQuery Dependency',
    //   desc: 'jQuery is great JS library, But Its not a great idea to use jQuery and React in the same UI.',
    //   icon: 'bi-shield-check',
    // },
    // {
    //   title: 'Colors Options',
    //   desc: 'Unlimited color options allows you to set your application color as per your branding.',
    //   icon: 'bi-droplet-half',
    // },
    // {
    //   title: 'Code Splitting',
    //   desc: 'To avoid winding up with a large bundle, it’s good to get ahead of the problem and use "Code Splitting".',
    //   icon: 'bi-file-code',
    // },
    // {
    //   title: 'Lazy Loading',
    //   desc: 'Its more efficient to split each routes components into a separate chunk, and only load them when the route is visited.',
    //   icon: 'bi-arrow-clockwise',
    // },
    // {
    //   title: 'Continuous Updates',
    //   desc: 'Regular updates with new demos and features is guaranteed',
    //   icon: 'bi-bag-check',
    // },
    // {
    //   title: 'Quality Code',
    //   desc: 'We follow the best industry code structure that all developers will be able to pick up easily and fall in love',
    //   icon: 'bi-stars',
    // },
    // {
    //   title: 'Support',
    //   desc: 'Premium customer support from the actual people who have created.',
    //   icon: 'bi-person-check',
    // },
  ];
  return (
    <Row>
      <Col>
        {/* --------------------------------------------------------------------------------*/}
        {/* Card-1*/}
        {/* --------------------------------------------------------------------------------*/}

        <Card>
          <CardTitle tag="h6" className="border-bottom p-3 mb-0">
            <i className="bi bi-bell me-2"> </i>
            About our web-app
          </CardTitle>




          <Row className='d-flex'>
            <Col lg="8">
              <div className="mt-5">
                <ComponentCard
                  title="Sync Security"
                  subtitle={
                    <h5>
                      Secure securities with sync security....
                    </h5>
                  }
                >
                  {/* <Image src='https://www.wrappixel.com/wp-content/uploads/edd/2020/04/xtreme-react-admin-template-y.jpg' alt='pro version image' className='mt-2'/> */}
                  {/* <img src='https://www.wrappixel.com/wp-content/uploads/edd/2020/04/xtreme-react-admin-template-y.jpg' alt='pro version image' className='mt-2' /> */}

                  <img src={bond} alt="pro version" className="w-100" />

                  {/* <div className="mt-3">
                    <Button
                      color="primary"
                      href="https://www.wrappixel.com/templates/xtreme-react-redux-admin/?ref=33"
                      target="_blank"
                    >
                      
                    </Button>
                  </div> */}
                </ComponentCard>
              </div>
            </Col>
          </Row>


          <ComponentCard title="Features">
            <Row>
              {features.map((feature) => (
                <Col sm="4" className="mb-sm-5 mb-4 pb-3" key={feature.title}>
                  <div>
                    <i className={`bi ${feature.icon} text-primary fs-2`} />

                    <CardTitle tag="h4" className="my-3">
                      {feature.title}
                    </CardTitle>
                    <CardSubtitle className="text-muted col-sm-10 col-12">{feature.desc}</CardSubtitle>
                  </div>
                </Col>
              ))}
            </Row>
          </ComponentCard>
        </Card>
      </Col>
    </Row>
  );
};

export default About;
