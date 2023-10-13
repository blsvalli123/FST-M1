from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity1():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    pageTitle = driver.title
    assert pageTitle == "Alchemy LMS – An LMS Application"
    print(pageTitle)


Project_Activity1()
