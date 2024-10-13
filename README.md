GHI CHÚ
- AdventureGame.docx **gồm** Mọi thông tin chi tiết và hình ảnh minh họa màn hình của những chức năng
- folder Player_Image **gồm** Hình ảnh nhân vật người chơi trong  ( vẽ qua webite [Piskel](https://www.piskelapp.com/) )
- Adventure.mdj **gồm** Activity diagram,Usecase minh họa cho các chức năng
- Công cụ hỗ trợ: Eclipse (https://eclipseide.org/)



LƯU Ý: ĐỒ ÁN NÀY CHỈ MANG TÍNH CHẤT THAM KHẢO MÔ HÌNH GAME ĐÃ CÓ SẴN TRONG THỰC TẾ. 
- Nhóm đã học hỏi, nghiên cứu và áp dụng vào đồ án, bên cạnh đó sáng tạo thêm những chức năng như:
  +  Người chơi tàn hình khi ăn túp lều trong khoảng thời gian quy định và trở lại trạng thái như bình thường
  +  Cho phép người chơi có thể tự do chọn nhân vật
  +  Hiển thị só điểm trên màn hình
  +  Mỗi khi tăng level thì túi vật phẩm sẽ tăng lên 5 ô chứa vật phẩm mới, mỗi trang tối đa 20 vật phẩm
  +  Mỗi khi người chơi lên level mới sẽ mở thêm nhiều tính năng mới trong game
  +  Và còn nhiều tính năng khác,...
 

TÓM TẮT CÁC CHỨC NĂNG ĐÃ LÀM ĐƯỢC

●	Hoàn thành các chức năng cơ bản của game tấn công quái vật như: điều khiển nhân vật di chuyển, tấn công quái vật bằng rìu, kiếm, lửa, các cấp độ quái vật độ khó khác nhau tăng dần như: green slime, bat, orc, red slime, SkeletonLord (đây là quái vật khó tấn công nhất)

●	Lưu lại được các level, mana, maxMana, life, maxLife, strength, coin, nextLevelExp, dexterity vào file save.dat và lưu FullScreen, Music Volume, SE Volume vào file config.txt

●	Tăng level sau khi Kinh nghiệm vượt qua mức level kế tiếp, có sự thay đổi khi lên level mới như: máu tăng, exp tăng, strength(càng cao thì độ gây sát thương quái vật càng lớn) tăng, dexterity(càng cao thì sát thương nhận càng ít) tăng. 

●	Xây dựng nhiều map và xem được miniMap để dễ dàng di chuyển, tạo hoạt ảnh cho nhân vật game (đứng yên, đi, tấn công bằng kiếm, chặt cây bằng rìu), dùng lều để kích hoạt thời gian sáng nhanh hơn

●	Khi đứng quá gần quái vật thì nó sẽ đi theo người chơi và tấn công người chơi trong phạm vi cài đặt

●	Chức năng Retry, LoadGame

●	Cho phép người chơi có thể tự do chọn nhân vật.

●	Trò chuyện được với npc

●	Sau khi chơi game thua hết máu sẽ có chức năng GameOver

●	Chức năng knock: gõ vào quái vật sẽ văng ra xa

●	Các vật phẩm giúp ích như: Portion Red giúp hồi sinh máu, Tent giúp kích hoạt ban ngày nhanh hơn, Lantern là đèn chiếu sáng trong bóng tối, Shield Wood độ phòng thủ ít hơn Shield Blue, axe giúp chặt cây hoặc tấn công sát thương quái vật, ManaCrystal vật phẩm cung cấp lửa (Fireball), sword normal chỉ dùng để tấn công sát thương quái vật, pick Axe dùng để đâp tường, key dùng để mở cửa hoặc gương kho báu (chest)

●	Trao đổi vật phẩm: mua, bán vật phẩm trong túi vật phẩm

●	Đẩy các cục đá và hố và khi lấp đủ 3 hố sẽ mở được cửa

●	Những chức năng nhỏ: dùng trò chơi (pause), xem vị trí đứng, tăng chỉnh âm lượng nhạc, tắt bật fullScreen, tính năng bất tử (God Mode)

●	Tàn hình khi sử dụng lều trong vòng 10s

●	Mỗi khi tăng level thì túi vật phẩm sẽ tăng lên 5 ô chứa vật phẩm mới, mỗi trang tối đa 20 vật phẩm



HƯỚNG PHÁT TRIỂN

●	Thêm chế độ PvE (Player versus Environment) với các mức độ Easy, Normal, Hard.

●	Bổ sung thêm chế độ nhiều vòng đấu (BO3: Best of 3 matches, BO5: Best of 5 matches). 

●	Bổ sung kho vũ khí và các item gia tăng sức mạnh cho nhân vật.

●	Phát triển thêm map mới, nhân vật mới mang lại sự đa dạng cho người chơi.

●	Cải thiện giao diện trò chơi hơn nữa. 



  TÀI LIỆU THAM KHẢO
[1] Lập trình game đi cảnh Mega Man trên Java Mở đầu (youtube.com)

[2] Xây dựng game mario với unity (phần 6) | Mario game Unity | Hướng dẫn làm game Mario bằng Unity (youtube.com)

[3] Best Way to Import 2D Sprites & Pixel Art - Unity 2018 Tutorial (youtube.com)

[4] Unity 2D - RPG Tutorial 2024 - Part 01 Adding Background (youtube.com)

[5] Sprite Creation with Piskel -- Unity 2D Platform Game (youtube.com)

[6] Piskel - Creating Tile Sets Part 2 (youtube.com)

[7] Creating my first Walk Cycle - Pixel Art Loop in Piskel (youtube.com)

[8] How to make a 2D Game in Unity (youtube.com)

[9] 2D Movement in Unity (Tutorial) (youtube.com)

[10] How to Get Started with Unity 2D Game Development | Unity

[11] 2D Beginner: Adventure Game - Unity Learn

[12] Unity - Manual: 2D game development quickstart guide (unity3d.com)

[13] Learn How to Make a 2D Game in Unity Step-by-Step - Udemy Blog

[14] Making 2D games with Unity for beginners – Ruby's Adventure (youtube.com)

[15] 2D LEVEL DESIGN in Unity 2019! 🔥 Making a 2D Game Tutorial (youtube.com)

[16] Unity Solutions for 2D | Unity

[17] Bing Video 

[18] Piskel - Free online sprite editor (piskelapp.com)
