Feature: Purchase personal health insurance on the IZIon24 app

Background: 
# --- Đăng nhập & vào danh mục ---
Given enter the phone number 
And select the checkbox to agree to the terms
When click the "Continue" button
Then The system proceeds to the second-level password step

Scenario: Mua bảo hiểm Sức khỏe cá nhân – gói "Sống sung túc" cho bản thân và đi đến màn hình thanh toán
# --- Nhập thông tin người được bảo hiểm
When  The user selects the "Health" category
Then The user selects the subcategory "personal health"
When The user selects their date of birth
And The user selects the gender "Male"
Then The user clicks "Update"

# -- chọn sản phẩm 
Given The user searches for and selects the "Personal Health Insurance" product
When The user expands the product list package
Then The user selects the "Prosperous Living" plan
And The user swipes to the end of the line to read the information.
Then The user clicks "Select to purchase" or "Sign up now"

#-- bước 1: chọn người được bảo hiểm 
Given The user selects "Self" as the insured person
And click "Continue"

# -- bước 2: định danh

@tc02
Scenario: lead generation FEC 
#-- đăng ký led generation
Given the user click the popup
When the user click the button register form
# --page thông tin đăng ký
Then the user click consent check box 1
Then the user click dropdown in the pdf 1
And the user click the button in the pdf 1
Then the user click check box link
# page nội dung mục đích và phương thức
And the user click consent check box 2
Then the user click button submit 2
And the user click consent check box 3
Then the user click button submit 3
And the user click consent check box 4
Then the user click button submit 4
#And the user click consent check box 5
And the user click consent check box 6
Then the user click button submit page
# page thông tin đăng ký
Given the user click the button register


@tc01
Scenario: Mua bảo hiểm TNDS bắt buộc Chủ xe máy
#--- tìm danh mục bảo hiểm TNDS bắt buộc Chủ xe máy
Given the user click close the popup
Given the user clicks See more in the insurance category section
When the user selects the product
When the user selects the vehicle type 50cc or larger
Then the user clicks Update
#-- chọn sản phẩm xe máy trên 50cc
Given The user selects the product base
Given The user selects the product card with premiums starting from 66 VND
#When the user chooses to fill in the information themselves
When The user click check box
When The user enters name 
And The user enters license plate number
And The user enters the vin 
And The user hover click screen
Then the user clicks Continue
#-- xác nhận thông tin
Given The user selects checkbox
When the user clicks box number 1 the link
And The user clicks the down arrow to scroll 1
And the user clicks submit 1
And The user checks box number 2 the link 
And The user clicks the down arrow to scroll 2
And the user clicks submit 2
Then the user click payment
#-- thanh toán bằng API
Given the user chooses to use a payment code
When Login Get Token For Payoo
Then Cash Payment Confirm

#-- thanh toán bằng payoo 
#Given the user selects the payoo to payment
#When the user selects a domestic card
#When the user selects a bank for payment
#Then the user enters the card number
#And the user enters the name printed on the card
#And the user enters the card issuance date
#And the user enters their phone number
#Then the user clicks continue a firts time
#Then the user clicks continue a second time
#Then the user clicks confirm








