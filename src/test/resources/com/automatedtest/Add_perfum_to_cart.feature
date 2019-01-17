Feature: Testing

  @Add_perfum_to_cart
  Scenario Outline: Add Perfum to Cart

    Given The user navigates to Flaconi landing page on market "<Market>"
    When The user closes the cookie message overlay
    Then The user searches for product "<Perfum>"
    When The user selects product "<Perfum>" from product grid
    When The user selects first size of the list on product detail page
    Then The cart overlay is shown to the user
    When The user clicks on view bag in cart overlay
    Then The cart page is shown to the user
    Then Product "<Perfum>" is displayed on cart page

    Examples:
      | Market | Perfum                            |
      | de     | Dolce & Gabbana Light Blue        |
      | at     | Giorgio Armani Acqua di Giò Homme |
