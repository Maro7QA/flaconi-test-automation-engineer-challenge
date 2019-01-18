Feature: Add perfum to cart

  @Add_perfum_to_cart
  Scenario Outline: Add Perfum to Cart for Flaconi markets

    Given The user navigates to Flaconi landing page on market "<Market>"
    When The user closes the cookie message overlay
    Then The user searches for product "<Perfum>"
   # When The user selects product "<Perfum>" from product grid
    When The user selects first product from product gird
 #   When The user selects first size of the list on product detail page
    When The user selects size on product detail page by index "1"
    Then The cart overlay is shown to the user
    When The user clicks on view bag in cart overlay
    Then The cart page is shown to the user
    Then The previously selected product by index is shown on cart page
    Then Product "<Perfum>" is displayed on cart page

    Examples:
      | Market | Perfum                            |
      | de     | Dolce & Gabbana Light Blue        |
      | at     | Giorgio Armani Acqua di Giò Homme |

