jQuery(function () {
    jQuery('.j_add').on('click', function (e) {
        e.preventDefault();
        
       /* var clienteID = jQuery('#clienteID').val();
        var prodID = jQuery(this).attr('rel');
        var qtd = jQuery('#' + prodID).val();
        
        var dados = {
             clienteID : clienteID,
             produtoID : prodID,
             qtd  : qtd
        }        

        if (qtd > 0) { 
            jQuery.post('admin/carrinho/adicionarCarrinho.jsp' , dados).done(function(msg){ 
                    alert(msg);
            });
        }*/
        

        var clienteID = jQuery('#clienteID').val();
        var prodID = jQuery(this).attr('rel');
        var qtd = jQuery('#' + prodID).val();        
       
       var dados = {
             clienteID : clienteID,
             produtoID : prodID,
             qtd  : qtd
        }          
        

        if (qtd > 0) { 
            jQuery.ajax({                
                type: 'POST',
                url: 'admin/carrinho/adicionarCarrinho.jsp',
                data: dados,
                 success: function (msg) {
                      alert(msg);
                }
            });            
            
        }
    });
});