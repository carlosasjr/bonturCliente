$.noConflict();


jQuery(document).ready(function ($) {

    "use strict";

    [].slice.call(document.querySelectorAll('select.cs-select')).forEach(function (el) {
        new SelectFx(el);
    });

    jQuery('.selectpicker').selectpicker;


    $('#menuToggle').on('click', function (event) {
        $('body').toggleClass('open');
    });

    $('.search-trigger').on('click', function (event) {
        event.preventDefault();
        event.stopPropagation();
        $('.search-trigger').parent('.header-left').addClass('open');
    });

    $('.search-close').on('click', function (event) {
        event.preventDefault();
        event.stopPropagation();
        $('.search-trigger').parent('.header-left').removeClass('open');
    });


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
                    jQuery('#countItens').html(json.carrinho.qtd);
                }
            });
        }
    }


    function totalizaCarrinho(clienteID) {

        if (clienteID !== null) {
            var dados = {
                clienteID: clienteID
            };

            jQuery.ajax({
                type: 'POST',
                dataType: 'json',
                url: 'http://localhost:8084/bonturCliente/admin/carrinho/totalizaCarrinho.jsp',
                data: dados,
                success: function (json) {
                    jQuery('.subtotal').html(json.carrinho.total);
                }
            });
        }
    }



    var clienteID = jQuery('#clienteID').val();

    if (clienteID !== null) {
        countItemCarrinho(clienteID);
        totalizaCarrinho(clienteID);
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
                success: function (json) {                    
                    countItemCarrinho(clienteID);
                    alertify.alert(json.carrinho.produto +  ' - Qtd: ' + json.carrinho.qtd + '<br> Adicionado ao carrinho!');
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
                    totalizaCarrinho(clienteID);
                });

            }
        });
    });

    jQuery('.quantidade').on('change', function () {
        var qtd = jQuery(this).val();
        
        var id = jQuery(this).attr('data-id');

        var dados = {
            idItem: id,
            qtd: qtd
        };
        

        jQuery.ajax({
            type: 'POST',
            url: 'http://localhost:8084/bonturCliente/admin/carrinho/alterarQuantidade.jsp',
            data: dados,
            success: function (html) {                    
                    totalizaCarrinho(clienteID);   
            }
        });
    });
    
    
    
    
    //VALIDAÇÕES DE FORMULÁRIO
    jQuery("#cartaocredito").mask("0000-0000-0000-0000");
    jQuery("#cvv").mask("000");
    
    
    jQuery("#formCartao").validate({
        rules: {
            nomecartao: {
                required: true
            },
            
            cartaocredito : {
                required: true
                //creditcard: true
            },
            
            cvv : {
                required: true
            }

        },
        submitHandler: function (form) {
             alertify.alert("Venda realizada com sucesso!")
        }
    });




});
