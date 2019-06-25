function countItemCarrinho(clienteID) {

    if (clienteID !== null) {
        var dados = {
            clienteID: clienteID
        };

        jQuery.ajax({
            type: 'POST',
            dataType: 'json',
            url: 'http://localhost:8084/bonturCliente/admin/carrinho/ItemCarrinho.jsp',
            data: dados,
            success: function (json) {
                if (jQuery('#countItens').lenght > 0)
                {
                    alert(json.carrinho.qtd);
                    jQuery('#countItens').html(json.carrinho.qtd);
                }
            }
        });
    }
}



jQuery(function () {
    var clienteID = jQuery('#clienteID').val();

    if (clienteID !== null) {
        countItemCarrinho(clienteID);
    }

    jQuery('.j_add').on('click', function (e) {
        e.preventDefault();

        var prodID = jQuery(this).attr('rel');
        var qtd = jQuery('#' + prodID).val();

        var dados = {
            clienteID: clienteID,
            produtoID: prodID,
            qtd: qtd
        };


        if (qtd > 0) {
            jQuery.ajax({
                type: 'POST',
                url: 'admin/carrinho/adicionarCarrinho.jsp',
                data: dados,
                success: function (html) {
                    console.log(html);
                    countItemCarrinho(clienteID);
                }
            });

        }
    });


    jQuery('.j_excluir_item').on('click', function (e) {
        e.preventDefault();

        var id = jQuery(this).attr('rel');
        var clienteID = jQuery('#clienteID').val();

        var dados = {
            idItem: id
        };

        jQuery.ajax({
            type: 'POST',
            url: 'http://localhost:8084/bonturCliente/admin/carrinho/excluirItem.jsp',
            data: dados,
            success: function (html) {
                jQuery('#' + id).fadeOut(400, function () {
                    countItemCarrinho(clienteID);
                });

            }
        });
    });



});