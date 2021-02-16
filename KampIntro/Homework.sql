/*Her bir üründen toplamda ne kadar para kazandığımızı bulunuz.

İpucu : Group by kullanılacak
İpucu : Products, Orders, Order Details tabloları join edilecek.
İpucu : Sum kullanılacak.

Sonuç aşağıdaki formatta olmalıdır.
Ürün Adı, Kazanılan Toplam Miktar

Not : Kazanılan tutar toplamı Order Details tablosunda unitPrice ve quantity alanlarının çarpımından beslenecek.*/

select p.ProductName [Ürün Adı], sum((od.UnitPrice*od.Quantity)-o.Freight) [Elde edilen gelir] 
from Products p inner join [Order Details] od on p.ProductID=od.ProductID 
inner join  Orders o on od.OrderID=od.OrderID  
group by p.ProductName order  by [Elde edilen gelir] desc