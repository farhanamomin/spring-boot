package com.farhana.lmspractice;

import com.farhana.lmspractice.entity.CourseDetails;
import com.farhana.lmspractice.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class LmspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmspracticeApplication.class, args);
	}

	@Autowired
	CourseRepo courseRepo;

	@PostConstruct
	public void save() {


		List<CourseDetails> users = Stream.of(new CourseDetails(1, "C++ Full stack", "full stack", "25000", "img"
								, "A Java Developer is a programmer who designs, develops, and manages Java-based applications and software. With most large organizations using ..."),
						new CourseDetails(2, "html", "html", "5000", "finance", "jhdkjwhcjhd jkrehfjkhejej"),
						new CourseDetails(100, "css", "css", "5000", "img",
								"hdcjhdkjchjdgcjhdgchjgdhc"),
						new CourseDetails(100, "machine learning", "machine learning", "5000", "img",
								"hdcjhdkjchjdgcjhdgchjgdhc"))

				.collect(Collectors.toList());
		courseRepo.saveAll(users);

	}
}
	/*
	const menu = [
	{



	{
		id: 4,
				title: 'machine learning',
			category: 'machine learning',
			price:25000,
			img: 'https://imageio.forbes.com/specials-images/dam/imageserve/966248982/960x0.jpg?format=jpg&width=960',
			desc: `Shabby chic keffiyeh neutra snackwave pork belly shoreditch. Prism austin mlkshk truffaut, `,
	},
	{
		id: 5,
				title: 'Linux',
			category: 'stock market',
			price: 25000,
			img: 'https://m.foolcdn.com/media/dubs/original_images/Intro_slide_-_digital_stock_chart_going_up_-_source_getty.jpg',
			desc: `franzen vegan pabst bicycle rights kickstarter pinterest meditation farm-to-table 90's pop-up `,
	},
	{
		id: 6,
				titl:'stock market',
			category: 'stock market',
			price: 25000,
			img: 'https://m.foolcdn.com/media/dubs/original_images/Intro_slide_-_digital_stock_chart_going_up_-_source_getty.jpg',
			desc: `Portland chicharrones ethical edison bulb, palo santo craft beer chia heirloom iPhone everyday`,
	},
	{
		id: 7,
				title: 'Python full stack',
			category: 'full stack',
			price: 25000,
			img: 'https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190626123927/untitlsssssed.png',
			desc: `carry jianbing normcore freegan. Viral single-origin coffee live-edge, pork belly cloud bread iceland put a bird `,
	},
	{
		id: 8,
				title: 'machine learning',
			category: 'machine learning',
			price: 25000,
			img: 'https://imageio.forbes.com/specials-images/dam/imageserve/966248982/960x0.jpg?format=jpg&width=960',
			desc: `on it tumblr kickstarter thundercats migas everyday carry squid palo santo leggings. Food truck truffaut  `,
	},
	{
		id: 9,
				title: 'Java full stack',
			category: 'full stack',
			price:25000,
			img: 'https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190626123927/untitlsssssed.png',
			desc: `skateboard fam synth authentic semiotics. Live-edge lyft af, edison bulb yuccie crucifix microdosing.`,
	},
			];
	export default menu;

	 */


