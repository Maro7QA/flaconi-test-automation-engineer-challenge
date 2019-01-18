Feature: Testing

  @Add_perfume_to_cart
  Scenario Outline: Add Perfume to Cart Flaconi markets

    Given The user navigates to Flaconi landing page on market "<Market>"
    When The user closes the cookie message overlay
    Then The user searches for product "<Perfume>"
    When The user selects product "<Perfume>" from product grid
    When The user selects first size of the list on product detail page
    Then The cart overlay is shown to the user
    When The user clicks on view bag in cart overlay
    Then The cart page is shown to the user
    Then Product "<Perfume>" is displayed on cart page

    Examples:
      | Market | Perfume                           |
      | de     | Dolce & Gabbana Light Blue        |
      | at     | Giorgio Armani Acqua di Giò Homme |