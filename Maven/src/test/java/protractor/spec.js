describe('Protractor baby steps',function() {  

// to comment a line: cntr+k+c
// to uncomment a line: cntr+k+u

    // it('Open Angular js website',function() {
    
    
    // browser.get('https://angularjs.org/');
    // browser.sleep(3000);
    
    // //write your protractor raw code
    
    
    
    // });
    it('Open Angular github website',function() {
    browser.get("http://juliemr.github.io/protractor-demo/").then(function()
    {console.log("website is successfully opened");})
    element(by.model("first")).sendKeys("3");
    element(by.model("second")).sendKeys("5");
    element(by.id("gobutton")).click();
    browser.sleep(5000);
    
    
    });
    
     
    
    
    //Each it block will be called as a spec
    
        
    })
    
    
    
    