package OopsPractice;



		class Bike{
			int gear =5;
			String color ="blue";
			String name="sports bike";
			void braking(String name) {
				
				System.out.println(name);
				System.out.println(this.color);
				System.out.println("Drum brake");
				
				
			}
			class Pulsar extends Bike{
				
				String color ="black";
				String model ="semi sports bike";
				void details() {
					System.out.println(super.gear);
				}
				
			}		
		}

	public class objectClass {
		
		public static void main(String[] args) {
			Bike obj = new Bike();
			obj.braking("pulsar");
			System.out.println(obj.gear);
			
			
			
			
		}
	
	}
