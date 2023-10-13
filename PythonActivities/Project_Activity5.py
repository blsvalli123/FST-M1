import time
from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity5():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    myAccountLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/my-account/']").click()
    time.sleep(10)
    myAccountTitle = driver.title
    assert myAccountTitle =="My Account – Alchemy LMS"
    print(myAccountTitle)

Project_Activity5()