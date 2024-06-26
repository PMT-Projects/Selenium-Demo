// Generated by Selenium IDE
const { Builder, By, Key, until } = require('selenium-webdriver')
const assert = require('assert')

describe('Amazon Demo', function() {
  this.timeout(30000)
  let driver
  let vars
  beforeEach(async function() {
    driver = await new Builder().forBrowser('chrome').build()
    vars = {}
  })
  afterEach(async function() {
    await driver.quit();
  })
  async function waitForWindow(timeout = 2) {
    await driver.sleep(timeout)
    const handlesThen = vars["windowHandles"]
    const handlesNow = await driver.getAllWindowHandles()
    if (handlesNow.length > handlesThen.length) {
      return handlesNow.find(handle => (!handlesThen.includes(handle)))
    }
    throw new Error("New window did not appear before timeout")
  }
  it('Test1', async function() {
    // Test name: Test1
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    await driver.get("https://www.amazon.in/")
    // 2 | setWindowSize | 809x688 |  | 
    await driver.manage().window().setRect({ width: 809, height: 688 })
    // 3 | mouseOver | id=icp-nav-flyout |  | 
    {
      const element = await driver.findElement(By.id("icp-nav-flyout"))
      await driver.actions({ bridge: true }).moveToElement(element).perform()
    }
    // 4 | runScript | window.scrollTo(0,0) |  | 
    await driver.executeScript("window.scrollTo(0,0)")
    // 5 | click | linkText=Best Sellers |  | 
    await driver.findElement(By.linkText("Best Sellers")).click()
    // 6 | click | css=#B0D17XMJKQ .a-dynamic-image |  | 
    await driver.findElement(By.css("#B0D17XMJKQ .a-dynamic-image")).click()
    // 7 | mouseOver | id=nav-link-accountList |  | 
    {
      const element = await driver.findElement(By.id("nav-link-accountList"))
      await driver.actions({ bridge: true }).moveToElement(element).perform()
    }
    // 8 | mouseOut | id=nav-link-accountList |  | 
    {
      const element = await driver.findElement(By.CSS_SELECTOR, "body")
      await driver.actions({ bridge: true }).moveToElement(element, 0, 0).perform()
    }
    // 9 | close |  |  | 
    await driver.close()
  })
  it('Test2', async function() {
    // Test name: Test2
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    await driver.get("https://www.amazon.in/")
    // 2 | setWindowSize | 809x688 |  | 
    await driver.manage().window().setRect({ width: 809, height: 688 })
    // 3 | runScript | window.scrollTo(0,2952) |  | 
    await driver.executeScript("window.scrollTo(0,2952)")
    // 4 | click | css=.scroll-carousel_slide__1ku-E:nth-child(11) .imageOverlay--eK9PK |  | 
    vars["windowHandles"] = await driver.getAllWindowHandles()
    // 5 | storeWindowHandle | root |  | 
    await driver.findElement(By.css(".scroll-carousel_slide__1ku-E:nth-child(11) .imageOverlay--eK9PK")).click()
    // 6 | selectWindow | handle=${win6122} |  | 
    vars["win6122"] = await waitForWindow(2000)
    // 7 | mouseOver | id=icp-nav-flyout |  | 
    vars["root"] = await driver.getWindowHandle()
    // 8 | selectWindow | handle=${root} |  | 
    await driver.switchTo().window(vars["win6122"])
    // 9 | runScript | window.scrollTo(0,0) |  | 
    {
      const element = await driver.findElement(By.id("icp-nav-flyout"))
      await driver.actions({ bridge: true }).moveToElement(element).perform()
    }
    // 10 | mouseOver | css=.a-carousel-goto-prevpage |  | 
    await driver.switchTo().window(vars["root"])
    // 11 | storeValue | id=nav-search-submit-button | search | 
    await driver.executeScript("window.scrollTo(0,0)")
    // 12 | echo | ${search} |  | 
    {
      const element = await driver.findElement(By.css(".a-carousel-goto-prevpage"))
      await driver.actions({ bridge: true }).moveToElement(element).perform()
    }
    // 13 | close |  |  | 
    vars["search"] = await driver.findElement(By.id("nav-search-submit-button")).getAttribute("value")
    console.log(vars["search"])
    await driver.close()
  })
  it('Test3', async function() {
    // Test name: Test3
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    await driver.get("https://www.amazon.in/")
    // 2 | setWindowSize | 1552x832 |  | 
    await driver.manage().window().setRect({ width: 1552, height: 832 })
    // 3 | mouseOver | css=#nav-orders > .nav-line-2 |  | 
    {
      const element = await driver.findElement(By.css("#nav-orders > .nav-line-2"))
      await driver.actions({ bridge: true }).moveToElement(element).perform()
    }
    // 4 | mouseOut | css=#nav-orders > .nav-line-2 |  | 
    {
      const element = await driver.findElement(By.CSS_SELECTOR, "body")
      await driver.actions({ bridge: true }).moveToElement(element, 0, 0).perform()
    }
    // 5 | runScript | window.scrollTo(0,0) |  | 
    await driver.executeScript("window.scrollTo(0,0)")
    // 6 | runScript | window.scrollTo(0,0) |  | 
    await driver.executeScript("window.scrollTo(0,0)")
    // 7 | click | linkText=Mobiles |  | 
    await driver.findElement(By.linkText("Mobiles")).click()
    // 8 | mouseOver | css=#sobe_d_b_2_CW_1 .a-dynamic-image |  | 
    {
      const element = await driver.findElement(By.css("#sobe_d_b_2_CW_1 .a-dynamic-image"))
      await driver.actions({ bridge: true }).moveToElement(element).perform()
    }
    // 9 | mouseOut | css=#sobe_d_b_2_CW_1 .a-dynamic-image |  | 
    {
      const element = await driver.findElement(By.CSS_SELECTOR, "body")
      await driver.actions({ bridge: true }).moveToElement(element, 0, 0).perform()
    }
    // 11 | close |  |  | 
    await driver.close()
  })
})
