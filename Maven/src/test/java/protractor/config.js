exports.config = {
    seleniumAddress : 'http://localhost:4444/wd/hub',
    
        specs: ['spec.js'],
        capabilities: {
            browserName: 'firefox'
        }
     
    };

  //  npm install -g protractor

//webdriver-manager update

//webdriver manager start

//protractor config.js