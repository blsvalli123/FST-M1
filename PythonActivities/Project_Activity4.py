import time
from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity4():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    courseTitleElement = driver.find_element(By.XPATH,"(//div/h3[@class='entry-title'])[2]").text
    assert courseTitleElement == "Email Marketing Strategies"
    print(courseTitleElement)

Project_Activity4()
