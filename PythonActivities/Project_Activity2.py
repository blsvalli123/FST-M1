from selenium import webdriver
from selenium.webdriver.common.by import By
def Project_Activity2():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    heading = driver.find_element(By.CLASS_NAME,"uagb-ifb-title").text
    assert heading == "Learn from Industry Experts"
    print(heading)

Project_Activity2()