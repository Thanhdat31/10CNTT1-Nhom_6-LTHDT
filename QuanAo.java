
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanAo {
      private String Ten,Size,gioiTinh;
      private int maSo;
      
      public QuanAo(int maSo, String Ten, String Size, String gioiTinh) {
    	  super();
    	  this.maSo = maSo;
    	  this.Ten = Ten;
          this.Size = Size;
          this.gioiTinh = gioiTinh;
      }

    public int getMaSo() {
		return maSo;
	}
	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		this.Ten = ten;
	}	
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		this.Size = size;
	}  
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "QuanAo [Ten=" + Ten + ", Size=" + Size + ", gioiTinh=" + gioiTinh + ", maSo=" + maSo + "]";
	}
}
 class QuanAoNam extends QuanAo {
    private String chatLieu;
    private double Gia;
    private int soLuong;
    
    public QuanAoNam(String chatLieu, double Gia, int maSo, String Ten, String Size, int soLuong, String gioiTinh) {
   	 super(maSo, Ten, Size, gioiTinh);
   	 this.chatLieu = chatLieu;
   	 this.Gia = Gia;
   	 this.soLuong = soLuong;
    }

	public String getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}
	public double getGia() {
		return Gia;
	}
	public void setGia(double gia) {
		this.Gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	@Override
	public String toString() {
		return super.toString() + "QuanAoNam [chatLieu=" + chatLieu + ", Gia=" + Gia + ", soLuong=" + soLuong + "]";
	}	
}	
 class QuanAoNu extends QuanAo{
	    private String chatLieu;
	    private int soLuong;
	    private double Gia;
	    
	    public QuanAoNu(String Size, int soLuong, String Ten, int maSo,String chatLieu, double Gia, String gioiTinh) {
	    	super(maSo, Ten, Size, gioiTinh);   	
	    	this.soLuong = soLuong;
	    	this.Gia = Gia;
	    	this.chatLieu = chatLieu;   	 	
	    }
		public String getChatLieu() {
			return chatLieu;
		}
		public void setChatLieu(String chatLieu) {
			this.chatLieu = chatLieu;
		}
		public int getSoLuong() {
			return soLuong;
		}
		public void setSoLuong(int soLuong) {
			this.soLuong = soLuong;
		}
		public double getGia() {
			return Gia;
		}
		public void setGia(double gia) {
			this.Gia = gia;
		}

		@Override
		public String toString() {
			return super.toString() + "QuanAoNu [chatLieu=" + chatLieu + ", soLuong=" + soLuong + ", Gia=" + Gia + "]";
		}  
	}

 class DanhSachSanPham {
        ArrayList<QuanAoNam> DsList;
        Scanner sc;
        int chon;
        public DanhSachSanPham() {
        super();
        DsList = new ArrayList<QuanAoNam>();
        sc = new Scanner(System.in);
        }
public void menu(int n) {
	for(int i = 0; i < n; i++)
	{
		System.out.println("1. Nhập danh sách quần áo ");
		System.out.println("2. Xuất danh sách sản phẩm có trong kho ");
		System.out.println("3. Tìm Kiếm sản phẩm trong kho ");
		System.out.println("4. Chỉnh Sửa thông tin sản phẩm ");
		System.out.println("5. Sắp Xếp ");
		System.out.println("6. Xóa sản Phẩm ");
		System.out.println("7. In danh sach ");
		System.out.println("8. thoát ");
		chon = sc.nextInt();
		sc.nextLine();
		switch (chon) {
		case 1:
			while (true) {
			    System.out.println("Nhập 0 để dừng lại");
			    System.out.print("Nhập mã số: ");
			    int maSo = sc.nextInt();
			    if (maSo == 0) {
			        break;
			    }    
			    sc.nextLine();   
			    System.out.print("Nhập tên sản phẩm: ");
			    String Ten = sc.nextLine();

			    System.out.print("Nhập giới tính: ");
			    String gioiTinh = sc.nextLine();
			                                    
			    System.out.print("Nhập size: ");
			    String Size = sc.nextLine();
			    
			    System.out.println("Nhập Chất liệu vải: ");
			    String chatLieu = sc.nextLine();
					                	        
			    System.out.println("Nhập số lượng: ");
			    int soLuong = sc.nextInt();  
			    sc.nextLine();
			    System.out.println("Nhập giá: ");
			    double Gia = sc.nextDouble();
			    sc.nextLine(); 
			    DsList.add(new QuanAoNam(chatLieu, Gia, maSo, Ten, Size, soLuong, gioiTinh));    
			}
		                break;
		case 2:
			System.out.println("Sản phẩm có trong kho");
        	for (QuanAoNam Nam : DsList) {
        		    
        		    System.out.println("Mã số: " + Nam.getMaSo());
			        System.out.println("Tên sản phẩm: " + Nam.getTen());
			        System.out.println("Kích cỡ: " + Nam.getSize());
			        System.out.println("Số lượng: " + Nam.getSoLuong());
			        System.out.println("Giá: " + Nam.getGia());
			        System.out.println("Chất liệu: "+Nam.getChatLieu());
			        System.out.println("Giới tính: "+Nam.getGioiTinh());
			        System.out.println();
        	}
        	break;
		

		case 3:
		    while (true) {
		        System.out.println("Nhập từ khóa để tìm kiếm sản phẩm bạn cần tìm: ");
		        String tuKhoa = sc.nextLine();
		        boolean timThay = false;
		        for (QuanAoNam Nam : DsList) {
		            if (Integer.toString(Nam.getMaSo()).contains(tuKhoa)) {
		            	System.out.println();
		                System.out.println("Thông tin sản phẩm:");
		                System.out.println("Mã số: " + Nam.getMaSo());
		                System.out.println("Tên sản phẩm: " + Nam.getTen());
		                System.out.println("Kích cỡ: " + Nam.getSize());
		                System.out.println("Số lượng: " + Nam.getSoLuong());
		                System.out.println("Giá: " + Nam.getGia());
		                System.out.println("Chất liệu: "+Nam.getChatLieu());
		                System.out.println("Giới tính: "+Nam.getGioiTinh());
		                System.out.println();
		                timThay = true;
		            }
		        }
		        if (!timThay) {
		            System.out.println("Không tìm thấy sản phẩm");
		        }

		        System.out.println("Bạn có muốn tiếp tục tìm kiếm sản phẩm? (Y/N)");
		        String tiepTuc = sc.nextLine();
		        if (!tiepTuc.equalsIgnoreCase("Y")) {
		            break;
		        }
		    }
		    break;

		case 4:
		
			 System.out.print("Nhập mã sản phẩm cần cập nhật thông tin : ");
        	 int maSo = sc.nextInt();
        	 for (QuanAoNam Nam : DsList){
     	        if (Nam.getMaSo() == maSo) {
     	        	sc.nextLine();
     	            System.out.println("Sửa thông tin sản phẩm: ");
     	            System.out.print("Tên sản phẩm: ");
     	            String Ten = sc.nextLine();
     	            
     	            System.out.println("Kích cỡ: ");
                    String Size = sc.nextLine();
                    
                    System.out.println("Giới tính: ");
                    String gioiTinh = sc.nextLine();
                   	            
                    System.out.println("Chất liệu: ");
                    String chatLieu = sc.nextLine();
              
     	            System.out.println("Giá sản phẩm: ");
     	            double Gia = sc.nextDouble();
     	            
     	            System.out.println("Số lượng sản phẩm: ");
    	            int soLuong = sc.nextInt();
                    sc.nextLine();
     	            Nam.setTen(Ten);
     	            Nam.setSoLuong(soLuong);
     	            Nam.setGia(Gia);
     	            Nam.setGioiTinh(gioiTinh);
     	            Nam.setSize(Size);
     	            Nam.setChatLieu(chatLieu);
     	 
     	            System.out.println("Thông tin sản phẩm đã được cập nhật thành công!");
     	             
     	            break;
     	        }
     	    }
     	    System.out.println("Không tìm thấy sản phẩm có mã là " + maSo);
           
			
		break;
		case 5:
		
			  
			  Collections.sort(DsList, new Comparator<QuanAoNam>() {
        		@Override
        		public int compare(QuanAoNam sp1, QuanAoNam sp2) 
                {
        		if (sp1.getSoLuong() < sp2.getSoLuong()) {
        		return 1;
        		}
        		return -1;
        		}
        		});
			    System.out.println();
			    System.out.println("Sắp xếp giảm dần ");
        		System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo so luong:");
        		for (QuanAoNam Nam : DsList) {
                System.out.println("Số lượng sản phẩm: "+ Nam.getSoLuong());
        		System.out.println("Mã sản phẩm: " + Nam.getMaSo());
        		System.out.println("Tên sản phẩm: " + Nam.getTen());
        		System.out.println("Chất liệu sản phẩm: " +Nam.getChatLieu());
        		System.out.println("kích cỡ: " + Nam.getSize());
        		System.out.println("Giới Tính: " + Nam.getGioiTinh());
        		System.out.println("Giá: " + Nam.getGia());
        		System.out.println();
        		}
        		       		 
   			    Collections.sort(DsList, new Comparator<QuanAoNam>() {
           		@Override
           		public int compare(QuanAoNam sp1, QuanAoNam sp2) {
           		if (sp1.getSoLuong() > sp2.getSoLuong()) {
           		return 1;
           		}
           		return -1;
           		}
           		});
   			    System.out.println("Sắp xếp tăng dần ");   		    
           		System.out.println("Danh sách sản phẩm sau khi sắp xếp tăng dần theo so luong:");
           		
           		for (QuanAoNam Nam : DsList) {
           			System.out.println("Số lượng sản phẩm: "+ Nam.getSoLuong());
           			System.out.println("Mã sản phẩm: " + Nam.getMaSo());
            		System.out.println("Tên sản phẩm: " + Nam.getTen());
            		System.out.println("Chất liệu sản phẩm: " +Nam.getChatLieu());
            		System.out.println("kích cỡ: " + Nam.getSize());
            		System.out.println("Giới Tính: " + Nam.getGioiTinh());
            		System.out.println("Giá: " + Nam.getGia());
            		System.out.println();
           		}
           		break;
		
		case 6:
		
			
			    System.out.print("Nhap ma so san pham can xoa: ");
			    int maSo1 = sc.nextInt();
			    boolean timThay = false;
			    for (int i1 = 0; i1 < DsList.size(); i1++) {
			        if (DsList.get(i1).getMaSo() == maSo1) {
			            DsList.remove(i1);
			            System.out.println("Đã xóa thành công!");
			            timThay = true;
			            break;
			        }
			    }
			    if (!timThay) {
			        System.out.println("Khong tim thay san pham voi ma so " + maSo1);
			    }
			
		break;
		case 7:
		    
			System.out.println("Nhập số lượng sản phẩm cần in: ");
			int soLuongSanPham = sc.nextInt();
			sc.nextLine();
			for (int i2 = 0; i2 < soLuongSanPham; i2++) {
			    System.out.println("Nhập mã số sản phẩm cần in: ");
			    int maSo11 = sc.nextInt();
			    sc.nextLine();
			    boolean timThay1 = false;
			    for (QuanAoNam Nam : DsList) {
			        if (Nam.getMaSo() == maSo11) {
			        	System.out.println();
			            System.out.println("Mã số: " + Nam.getMaSo());
				        System.out.println("Tên sản phẩm: " + Nam.getTen());
				        System.out.println("Kích cỡ: " + Nam.getSize());
				        System.out.println("Số lượng: " + Nam.getSoLuong());
				        System.out.println("Giá: " + Nam.getGia());
				        System.out.println("Chất liệu: "+Nam.getChatLieu());
				        System.out.println("Giới tính: "+Nam.getGioiTinh());
				        System.out.println();
			            timThay1 = true;
			            break;
			        }
			    }
			    if (!timThay1) {
			        System.out.println("Không tìm thấy sản phẩm với mã số " + maSo11);
			    }
			}
		 break;
		case 8:		 
     	    System.out.println("Thoát chương trình");
     	    System.exit(0);
     	    break;
     	    
        default:
         System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
         break;
		
		}
		}
	}
}
  class main {
	 public static void main(String[] args) {
		DanhSachSanPham Ds = new DanhSachSanPham();
		Ds.menu(8);	
	}
	}

