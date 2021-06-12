package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		// getter setter fonksiyonları otomatik oluşturur.
@NoArgsConstructor
@AllArgsConstructor
@Entity		// veri tabanı nesnesisin demektir.
@Table(name="products")		// veri tabanında hangi tabloya karşılık geldiğini söyleriz.
public class Product {
	
	    @Id		// tablodaki primary key alanımızı belirtmek için kullanıyoruz.
	    @GeneratedValue(strategy = GenerationType.IDENTITY)		// id'miz bir bir arttırılıyor.
	    @Column(name="product_id")		// veri tabanındaki hangi kolona karşılık geldiğini yazıyoruz.
		private int id;
	    
	    // @Column(name="category_id")
		// private int categoryId;
	    
	    @Column(name="product_name")
		private String productName;
	    
	    @Column(name="unit_price")
		private double unitPrice;
	    
	    @Column(name="units_in_stock")
		private short unitsInStock;
	    
	    @Column(name="quantity_per_unit")
		private String quantityPerUnit;	
	    
	    @ManyToOne()
	    @JoinColumn(name = "category_id")
	    private Category category;
	    
}
