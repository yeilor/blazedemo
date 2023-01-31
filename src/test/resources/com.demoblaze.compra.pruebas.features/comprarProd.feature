#language:es
Característica: Un usuario agrega productos al carrito del sitio web demoblaze

  Escenario: Usuario selecciona y agrega productos al carrito
    Dado que el usuario se encuentra en el sitio web demoblaze
    Cuando selecciona un producto agregandolo al carrito
    Entonces visualiza el producto agregado en el carrito de compras
    Cuando selecciona otro producto llenando el formulario de compras
    Y da clic en el boton Purchase
    Entonces debe ver mensaje Thank you for your purchase!
    Y da clic en boton Ok
    Entonces debe volver a la pantalla de Inicio