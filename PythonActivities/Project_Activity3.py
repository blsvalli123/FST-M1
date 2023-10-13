import time

from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity3():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    time.sleep(20)
    infoBoxTitleElement = driver.find_element(By.XPATH,"(//div/h3[@class='uagb-ifb-title'])[1]").text

    assert infoBoxTitleElement == "Actionable Training"
    print(infoBoxTitleElement)

Project_Activity3()
