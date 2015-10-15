package com.java.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
=======
import com.java.pojo.Block;
>>>>>>> 7e5d21be20c4bec49dd167a62057750f51a34fa6
import com.java.pojo.Order;
import com.java.pojo.User;
import com.java.service.BlockManager;
import com.java.service.OrderManager;

@Controller
public class TraderBlockBlotterViewController {
	
	@Autowired
	private BlockManager blockManager;
	
	@Autowired
	private OrderManager orderManager;

	@RequestMapping(value="/block-blotter")
	public String loadEmptyModelBean(HttpSession session) {
		User user = (User) session.getAttribute("authenticatedUser");
		List<Block> blocks = blockManager.getBlocksForUser(user);
		user.setBlocks(blocks);
		for (Block block : user.getBlocks()) {
			List<Order> orders = orderManager.getOrdersForBlock(block);
			block.setOrders(orders);
		}
		return "block-blotter";
	}
<<<<<<< HEAD
	@RequestMapping(value="/test")
	public String testOrders(Model model){
		Order order = new Order();
		System.out.println(order.toString());
		
		model.addAttribute("pageHeader", "Tester Works");
		return "traderBlockBlotterView";
	}
=======
	
>>>>>>> 7e5d21be20c4bec49dd167a62057750f51a34fa6
	

}
