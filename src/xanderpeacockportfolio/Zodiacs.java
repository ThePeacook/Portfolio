/*
 * Xander Peacock
 * 10.17.18
 * Zodiac Switch Statements
 */

package xanderpeacockportfolio;

import java.util.Scanner;

public class Zodiacs {

	public static void main(String[] args) {
		/*
		 * Switch (switch-expression) {
		 * case value1:
		 *  Statements;
		 *  break;
		 * case value2:
		 *  Statements;
		 *  break;
		 * case value3:
		 *  Statements;
		 *  break;
		 * case value4:
		 *  Statements;
		 *  break;
		 * default:
		 *  Statements;
		 *  break;
		 * }
		 */
		
		// Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		
		// Case Statement
		switch (year % 12) {
		case 0:
			System.out.println(" __  __             _              \r\n" + 
							   "|  \\/  | ___  _ __ | | _____ _   _ \r\n" + 
							   "| |\\/| |/ _ \\| '_ \\| |/ / _ \\ | | |\r\n" + 
							   "| |  | | (_) | | | |   <  __/ |_| |\r\n" + 
							   "|_|  |_|\\___/|_| |_|_|\\_\\___|\\__, |\r\n" + 
							   "                             |___/ \r\n" + 
							   "");
			System.out.println("Traits: confident, charming, humorous, exuberant, and popular.\r\n");
			
			System.out.println("Disabilities: distrustful, arrogant, opportunistic, erratic, manipulative, and dishonest.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMW0odOKXNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMWNk:,;cloddxkkOO00KXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMWWN0l;;;;;,,;;;;;;::codxxOXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMWNKxl:;;;;;;;;;;;;;;;;;;;;;cokXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMW0o:;;;;;;;;;;;;;;;;;;;;;:;;;;;ckXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMNkc;;;:clodxdo:;;;;:coxkkxdo:;;;;:oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMWk:;;:ldoloxxOK0d:coxxdxxx0KX0o:;;;;oKWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWWWMWKl;;;dkl::ldkxxKNKKXx:;coxxdxKXd:;;;:okkOKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMXkoodxkd:;;:Oxd0d::kXkOWMM0oxd;;oKNkkX0c;;;:codxxkXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMXo:oxxxxl;;;:x0xk0000OOXWMMXxk0OO00Ok0W0c;:;;lold0kkNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWk:d0xoxkd:;:;:d00KKKKXWMWMMWX00KKK0OKWNk:::;:dOdlOOkNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWx;x0ll00dc::;::lONWWXKNWXKXWWWWWWWMWWNxc:::;cdxox0xOWMWMMMMWXKKKKXWWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWO:lOOoodkxc;;::;cOWNdcONx:dXMMMMMWNKOo:;:;::okOkkxONWMMWWKxo:::::cldOXWWWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMNOccdkkkdcll:::::xNWKKNWKOXWWMMMWOlc:;:::::codxkOXWMWMWXx::ldkOkxdl;;cxKWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWXkdoddk0NNkc;::xXKKNWNNNXXXXNWOc;;:;;:::o0NWWWMMMMMWXd:ckXWWMMMWNOl;,oXMMMMMWWWMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWWWMMWWMNkc;:d0ddkOOOOkkxkKKl;:;::;:cxXWMMMMMMMMMWO:cOWMMMMMMMMWXo;;xNMWWWMWWMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWWWMMMMMMMMMMWNx:;cONNXKOkkxkkOOo:;::::cdKWMMMMMMMMMMMNd;dXMMMMMMMWMMWOc:oKMWWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMW0ddOXWWMMMMMMMWNx::cdxl::;;;;;:::;;:::cxXWMMMMMMMMMMMMNd;dNMMMMMMWWMWWKo:lKMWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMW0l;;:cd0NWMMMMMMMNkl:::;;;:::;:::;:;;::::lkXWMMMMMMMMMMNx;lKMMWWN0xd0NW0l:oXMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWNkc;;;::::oOXWMMMMMWNkc;::;;::;;::::;;;::;;;:ldkKNWWMMMMMWOc:kNWWWKl::lxkl:cOWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWNOo:;;;;oOd:;:lkXWMMMWOc;:::::::;;::;;:;::;;;;;:;;:loxO0KXNWXxclkNWWNkolc::co0WMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMW0o:;;:c:;dXNOc;::lkXWW0c;:;:;;::;;:::clccdOd::lo:;::::;::cld0WKdclxXWWWNX000XWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWk:;:d0KdcdXWWKdc;;:lOKd;:;coc;:;:;:doxK0OXWNOlk0c;::cc::clcckNWKdccdKWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWO::kNWWNXNWMMMW0o::;:lc:;;xXOl:;::;lxKKk0NWX00XKo:ccllccccccdXWWXkc;lONWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMM0c:dKWMMMMMMMMMMNOo:;:;:;c0WW0l;:::;ckkccdkdcokxl:ccccldxolcl0WMMW0l::oKWMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMNkodKWMMMMMMMMMMMWXkc::;cOWMWWOc;::::::::;;::cccodlcccckXKdcckNMMMWXd:;ckNMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWWWMMMMMMMMMMMMMMWKxclONMMMMNk:;::::locclddxOk0Kdcc::ckXk:;oXMMMMMNkc;:xXMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMWXXXWWMMMMMMWXXWMMMMMWNxc:::cldk0KKKXX0KOl:::;;cOKo;:OWMMMWWW0l;:oKWMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMWKdccclxOKNWMMMMMMMMMMMMMXxcccccclk0kdddlcc:cc;::;lOOc;oXMMMN0k00o;;oXWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMW0l;;;;;;;:ldk0KNWMMMMMMMWWKocccclcccccc:::;ckk::::;lOx::dXMMXo;dXKl;;xNMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMW0l;;;;;;;;;;:;:coxOKNWWWWWWNOlcc::::::cdxkkOOKKl;:;:;lko;:oOK0o;lKW0c,c0WMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWKd:;;;;;;;;:::::cccodxOXWWWW0l::;::;:;:oOkdxxkxc;:;;;;lkxc;;:::;c0WWk;;xNMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMW0o;;;;;cddlccccok0OocldOXWOc::;::::::::::;;::;:::;;;;dKKkdc:codKWWKc,lKMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWNx:;:;l0NKkoccldkoccodlldo:;:::;coxxl:;:ll:::;;:;;;;:OWWWX0KWWMMMNd,:0MMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMNk:;:lOWWWXOoc::::d0Kx:;;:;:::;clONk:ckKk:;:;;:;;;;;xNWMMMMMMMMMNd,:0MMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWNx::cxNWWWWXx:;;:dOo:;:;;:lkOxoloOkcx0dc:::;;;;;;;;xWMMMMMMMMMMNd,c0MMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWMMWWWNdccl0WMMMMW0l;;::;;;;;;;:codddccodoox00Ol;;;;;;;:OWMMMMMMMMMMKc,dNMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWMWWWWWWWW0c;;dNMMMMWWXd:;;;;;;;;:ldxxoc:l0Kdcoool:;;;;;;:xNMMMMMMMMMMKo,c0WMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWXXKKKXNNWWNO:,,:kWMMMMMMNOc;;;;;;;:dkxoc:cddloxo:;;;;;;;;:xXMMMMMMMMMWKl,cOWWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMN0xollc:ccclool:;,,,cOWMMMMMMWKxc;;;;;;;;;;lkKXx;ckXx;;;;;;;;lONWMMMMMWWKxc:oKWMMMMMMMMMMMMMMM\r\n" + 
							   "MMMWWWOc:::::;;;,,,,,,,,,;,c0WMMMMMMWWXko:;;;;;;;d0Od:;;:ll;;;;;;;,,:ldxkkkkxlccd0WMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMWWK0KKKKKK00Okdol:;,,,,,c0WMMMMMMMMMNKkoc:;;;;;;;,;;;;;;;,,;codxddollllodk0NWMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWNX0OxdolcdXMMMMMMMMMMMMWXKOxoollccldk0KK0OO0XWMMMMWWWWWMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWNNXXNWWWWWWWWWWWWWWWWWWNNNNXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXNXXNNNNNNNNXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKkOkk0KKK00KXOOKK000KKKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKkOOkkOOkOOO0OkOOkkOOx0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXNNXXXXXXXXXXXXXXXNK0XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 1:
			System.out.println(" ____                 _            \r\n" + 
					           "|  _ \\ ___   ___  ___| |_ ___ _ __ \r\n" + 
					           "| |_) / _ \\ / _ \\/ __| __/ _ \\ '__|\r\n" + 
					           "|  _ < (_) | (_) \\__ \\ ||  __/ |   \r\n" + 
					           "|_| \\_\\___/ \\___/|___/\\__\\___|_|   \r\n" + 
					           "");
			System.out.println("Traits: charming, witty, honest, blunt, capable, talented, brave, and self-reliant.\r\n");
			
			System.out.println("Disabilities: controlling, insensitive, narrow-minded, selfish, and reckless.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMWNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMNNWWWMMMMWKodXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMXxox0NMMWW0c;oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMWKl,:o0NWWO:;;lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0c;;:xNNx;;;;oXMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWX0OO0KKNWWMNd;;;:oxc;;;;:kWKx0WWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWN0koc::lox0Kx;;;;;;;;;;;;oko:xWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWWXkl;;;:c:;;;:;::;;;;;::;;xNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMWWXK0Okxxxo:;;;;;;;::;;;:;;;;;;;cOWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWKxlc:;;;;;;;;;;:;;:::;;;;:cool:::lOOOO0XWWMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMNOxkOOkxdoc:;;:;;:;:::ll:;ck0OOo:;:::;;:o0WMMMMMMMWNKOkxxxxxkOKXWWWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWMMMMMMMWNkc;;::;;;:o00o:::okkkd:;:;::cx0XWMMMMWNOdl::;;;:::;;:coxOXWWMWWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWWKdc;;;;;::;:dXNOl:::::::;::::cld0NWMMMNOl::::lxkO0000kdc::cox0NWMWWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWKKXNWWWNX0xo:;;;:::;;;;;dXXXkclllxdc::;ckXXWWMMMWKd:;:lk0KKKKKKXXNNXxlccccd0WMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWKkdoooolc:;;;;;;:cc:;:;:dkokKO0KOkl:::;l0WMMMMWW0l::lOXK00KXNWWNNK0XXd:::;;:xNWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWKOkxddddddxkO0Od::;;:::cO0olol:;;::::kWWMMMW0l;ckXXKKNWWXK00O0Oodkl;;;;;;:dXMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMWWWWMMMWKo:;:::::;:lc;;;:;:ddc:c0WWMMWKl;o0XKKNWNXKKXXXNXKOdcoOd:;;;;;xNMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMW0l;::;:::;;:;;:::;;c0NKOKWMMMMNx:oKX0XWWNXNWWWWWNO0X0okW0c;;;;;:OWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMW0l:::::;;;:;;::;;:ol:OWWMMMMMMWOcoXX0XWWNNWWNXXKK0kkOklkN0l;;;;;;lKWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMKl:ol;:;;;::;::::;dOo;dXWMMMMMMNxl0N0KWNNWMNKKKXNWWMWMWX00X0o:;;;;;xNMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMNx;oOd::::::::::cok0d:;:xKNWWWWW0lxXKOXXKXNKKXWWMMWWWXKNWXk0MXo;;;;,lKMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMKl;xNX0dc:;:lloOXNKo:::::ldxxxddolxXkdOdldoONNXKXXXXKOkO0OkXMWx;;;;,:OMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWOc;d00XNKOkOXXNKkxxxkOkdlcccllccccclc:::cl:oxO0XNWMMWWWXOoOWMXo;;;;;;xWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWk:;:clkKNMWXOKKooOOkxkKXxccoc::cdo:lkkccOx::dKK00KKXNXKNWK0WNk:;;;;;;dNMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWk:;::::lKMNxcood0xcloxKXdckOl,:x0dd00ocOOl;:oO0KKKKKK0kO0k0WXo;;;;;;;dWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMO:;:;:;c0WKocco0Olclxkko:lxoclxxoxOdclOOl;;:dKKKXNWWMMWXkkNWWk:;;;;,,xWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMKl;;;;::xN0lccdX0l::;;;;::;;col::lccxOxc;:;cxKXXXXKKKKNMX0XWNk:;;;;,;OWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMNd;::::clxxl::lOXx::;:::;::::;:;;cdOkl:;:;:o0XXNWWWN0dxK00WNkc;;;,,,cKMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWKoccc:cc:::::;lkxccc;;;;;;;::coxkxl:;;::loo0NNXKKXNWXdxXNWO:;;;;;,;xNMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWWWKoc:::;;;;::;;:::okxxxdxxxxxxxoc;;;::::o0xco0WNkoKWKOXWNOl;;;,;;,lKMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMWWWWMMWXxc;;::;;;::;::;:clodddolc::;::;:;:;lOOKOc:xKKkdO0OKNkl:;;;;;;,c0WMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMWWWMMMMMMWWKkl:;;;;::::;;::;;;;;::::;;::;;::;lkOxl:;:d00KXXNXk:;;;;;;;,c0WMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMWWN0koc:;;:;;:;;::;;;;;::;;:;;;;;::cllllc:clcclddl:;;;,,;,;l0WMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kdl:;;;;;;;;;;;:::;;:loxk0KXNNNNKx:;;;;;;;;;;,,,;cxXWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXd:;cdkOkkkkdlc::;cOWWMMMMMMMMW0c;;;;;;;;;,;:lkXWMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNxlkKWMMMMMMWXXK0Odd0WMMMMMMMWKo;;;;;::cldxOKNWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWkckWMMMMMMMMMMMMMWNkokNWMMMMMWX000000KXNWWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKkcoXWMMMMMMMMMMMMMMMWOlxXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXkoc;;lxkXMMMMMMMMMMMMMMMNx:coxKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOOkxOKK0XWWWWWWWWWWWWWWWKxdodxOWWWWWWWWWWWWWMMWWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKXXNNNNNNNNNNXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOdxk0OOkOOOOkOkkOkOOOKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKO00000O0000O0000O00KNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 2:
			System.out.println(" ____              \r\n" + 
							   "|  _ \\  ___   __ _ \r\n" + 
							   "| | | |/ _ \\ / _` |\r\n" + 
							   "| |_| | (_) | (_| |\r\n" + 
							   "|____/ \\___/ \\__, |\r\n" + 
							   "             |___/ \r\n" + 
							   "");
			System.out.println("Traits: animated, likable, witty, sincere, cooperative, protective, helpful.\r\n");
			
			System.out.println("Disabilities: pessimistic, cynical, paranoid, overly aggressive, stubborn.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWWNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWMWNKOxdolcclox0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWNKkoc:;,,,;;,,,,;lkNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMWXko:,,;;;,;,,;;;,,;,;oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMNOc;,,;;,;;,;;,;;;;;;;;;lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0Oxxddddddxk0NMMMMWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMWk:,,,;;,,;;;;,,,;;;;;;;;;oXMMMMMMMMMMMMMMMMMMMMMWWWNWWN0xlc:;;;;;;;;;cxkxxXWWMWXOkxONMMMMMMMMMM\r\n" + 
							   "MMMW0c,;;;;,,,;;;;cdxkOkdc;;;;cOWMMMMMMMMMMMMMMMWNX0kdooloooc;;;;;;::ccc:;ckK0lcxOkoc;,,;dXMMMMMMMMM\r\n" + 
							   "MMMWO;,;;;;;,;;;o0NWWMWWWKo;;;:OWMMMMMMMMMMMMMMWKoc:;;:;;;;;:;;::cdddxkkOOxocc:;;;;:ldxxc;xNMMMMMMMM\r\n" + 
							   "MMMWO;,;;,;;;;,oXMMMMMMMWWk:;;c0MMMMMMMMMMMMMMMXo;:;:clc:;:;;;;:dK0o:dxlkWNKOl;;;;cONWMWk;:OWMMMMMMM\r\n" + 
							   "MMMW0c,,;;,;,;,lKMMMMMMWNOc;;ckNMMMMMMMMMMMMMMW0c;::okoc:::;::;:coO0kK0llxk0Xk:;;;oXMWMWk;;dNMMMMMMM\r\n" + 
							   "MMMWNd;,;;;c:::;dXWMMMMMNOxxkKWMMMMMMMMMMMMMMMNd::::dkoc;ldl:::;:::oOXN0kOOkoc;;;;xNMWWKl:xXWMMMMMMM\r\n" + 
							   "MMMWWKc,;ckKK00l:lkKNWWWWWWWWWMMMMMMMMMMMMMMMWOc;::::x0l;cxd::c:;::;:ldddl:;;;;;;:kXXKkcc0WMMMMMWWWM\r\n" + 
							   "MMMMMWO:;l0WN0oc;;;:loooooddddxOKNWMMMMMMMMMWKl:;;::;cxxddkkxxdc;:::;;;;;:::;;;;;lollc:;oXMMMMWWWWWW\r\n" + 
							   "MMMMMMNx:,lOx:;;;;;;;;::;;;;;;;::lx0NWMMMWWWKl:::::;;;;:c:cllcoxc;:::;;;::;::;:lkXNXKKx::0WWWWWWMMMM\r\n" + 
							   "MMMMMMMNx;;;;;;;;;;;;;;:::;;;;:::;;:oONWMWW0l::;::::;;::::::cd0x:;::::::::;:ldONWWNK0klcxXWWWWWWMMMM\r\n" + 
							   "MMMMMMMWNx:;;;;;;;;;;:;;::;;:::;::;:::oONMWKkoc::::::::;;:oxkko:;:::::;:cox0XWWWKxlccokKNWWMWMMMMMMM\r\n" + 
							   "MMMMMMMMWXd;;;;;;;:;:lodoc;;:;:;:::;::;:oONWWWX00000Oo:lccooc:::::::ldxOKNWWMMMNxc:o0NWWWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMXx:;;;;;;;;lkOkxkOd:::::;::;;:;:;:lxk0KK000OxdOXKkdc:;;;;:lkKNWMMMMWWWWKocdKWWMWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMXd;;;;;;;;;ckx:;;:lo::cllc:;::;;::;:::::::::;;lk0XWWXOxoc:;:coxOO0KXXNNXklcxNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMWk;;;;;:dxoc:lc;;;;;;::loxOxc;::;;::;;::::::::::;:ldk0XWNX0kdollccccloodoc::xNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMXo,;;;;x0o:;;;;::cooc:;:;:xXd::cc:;::;;::::;;::clc:;;:lxOKNWWNXK00kdlldddoxxkNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMXl,;;;:kk:;;:;:::cldko:::lOKo::okl;;::::::;:cokOkkkdc:cllldk0KNWWWWXk0WWN00OkNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMNo,;;;;lxdc;;;cxoc::cc;::odl::;l0d;;:;::::;o00xc::lolxkxdxxocloxkkkddkXXklclxNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMWO:;;;;;;cdo:;:oddl:;;;:odc;;:;dKd;::;:::::okkl::cccldlcclxOl:::::;:lx0Kxo::OWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMNk:;;;;;lKk;;;;;;;;;;:;o0o;:;cOKo;:::::oxolllccccccoocc:codc;;clc;l0XOkKXooXMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMW0o;;;;:dkxoooc;:loccdOkl;;ckKx:::ll:d0xccccldxlcld0d::ldl;:;cxo;:xOllkdo0WMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMWNk:;;;;cooooc;:lddddoc;:oO0d:;;:xkcd0xlccclxOkdloOo;:cdko:;lko;;;::::;cdkkOOOOOOOOO00KWMMM\r\n" + 
							   "MMMMMMMWMMW0c,;;;;;;;;;;::;;;;:ldkOxc::::ckKxcoxoc:cc:cooc:::;:;:kk::xOc;:;;;;;;;;;;;;;;,;,,,;;lKMMM\r\n" + 
							   "MMMMMMMMWNOl;;;;;;;;;;;;;:::::cooolccccccclk0koc::;cdo:;;:lcclloxko:oxl;;;;;;;;;;;;;;;;cdkxo;,;xNMMM\r\n" + 
							   "MMMMMMMNOl:,;;;;;;;;;;;;;:;;:c:::clcccccclcclddc::::oOkxxkxc:lddoc::::::cc:;;;;;;;;;;;lO0Kkc;;xNMMMM\r\n" + 
							   "MMMMMMMXd;,;;::;;;;;;;;:dkdcccclllccclcc:::;;;;;::::::lolc:;;;;;;:::lxOKXX0kl:;;;;;;;o0K0x:;;xNWMMMM\r\n" + 
							   "MMMMMMMMNOo:;o00OOkkkkxcckX0xlclk0000000d:;;:ldxOOxo:;::::;;;;::loc:coxOKNWWN0kxdoolclool:;ckNMMMMMM\r\n" + 
							   "MMMMMMMMMMNKxlo0XXXNNXKkc:d0NKkookKKKKOxo:;;:cxXWWWXxc:;;:ldxkOKKKkoc;;;cldxOKNWWWWNXK0Okk0XWMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWXkoccodxdooc:clxXWXOoccccc;;;cllxxxONMWWXkdc:lkKXNN0dcc:;;;;;:lxkkk0XWWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMNOoc:ccc::::;;lkNMNOo:;;lxxk0K00kox0XWWWWX0kdolllc::;;;;;cxOOOkxc;cOWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWWWWWXxcccc::llcodoo0WMNOo:ckK0ddoc:;:ckWMMMMMMWNXOxoc;;;;oxkOOOxc,,;dXWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWWWWWWWNOccxkxdkOkOOo:kNWWNOocclcclodxxx0WMMMMMMMMMMMWX0kdodxkko;,;cd0WMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWWWWWMMMWWWWOc;cl::lllodoxXWMMWNKKKXNNWMWMMMMMMMMMMMMMMMMMMMWWXOxdddx0XWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWMMMMMMMMMWXOO0KKXNNNWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMWWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNK0K0KXKKKXKKKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOOXOxkO0OkOOkKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNK0KKKK0KK0OkkXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 3:
			System.out.println(" ____  _       \r\n" + 
							   "|  _ \\(_) __ _ \r\n" + 
							   "| |_) | |/ _` |\r\n" + 
							   "|  __/| | (_| |\r\n" + 
							   "|_|   |_|\\__, |\r\n" + 
							   "         |___/ \r\n" + 
					 		   "");
			System.out.println("Traits: intelligent, thoughtful, creative, responsible, curious, and noble.\r\n");
			
			System.out.println("Disabilities: gullible, materialistic, insecure, and hot-tempered.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWNNNNNNNNNNNNWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXXKK0OOOkxxxdddoollldkxllllld00kO0O0NNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMWNX0kxdolcclcoookxlc:;cxd:;;;ckKd;;;;:xXK0dcx00KXOk0XWWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWNKkdlc;;;;;;coxkOdxKN0o:cOOol:coxOOddxdl;cO0kkkdllx0Kxc:ox0NMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWKxl:;;:clodxk0XNkdKKkxdoccOKxxxoOWNkcd0XW0l;xKkkXN0ko:o00o;;;lxKWMMMMMMMWXK00XWMMMM\r\n" + 
							   "MMWWXOkkkO0KKXN0o:;;cdk0XNNWNXKNWkcxKxloc:kNWN0xdxkO0OO000dc;l00k00O0KOockKd:;;,:o0NWWWWKkOKXXNWMMMM\r\n" + 
							   "MMMWN0oclol:;cc:,;lxkkxdddddoccOWOcc0Oc;:xXN0O0K0xlcclloool:::oOOkOkkkOkc:xKk:;;;;;oOkxoccdxd0NWMMMM\r\n" + 
							   "MMMMMWNOxxxd:,;;;col:;;;cllcc:;xN0c;xKo:d00X0odOX0kl;:dKNNXOl;::ccclllool::xXx:;;;;;,,cdlcdo;c0WMMMM\r\n" + 
							   "MMMMMMMWOc,:;;;;;;;;;;lkKKxc:;:xN0c;l0kcxOO0OOO00kko::xNWWNOc:;cdxkkkO00xl;lKXo;;;;;,;kNXkdddONMWWWM\r\n" + 
							   "MMMMMMMMWk:,;;;;;;;;;:o0Kxc::;:OWOc;:O0l:oxkOO0KK00Ooc:oxxdc;::lk00kkkxOko;:ONx;;;;;;,c0WMWWWWWWMMWW\r\n" + 
							   "MMMMMMMMM0c,;;;;;;;;;;;:lc:;:;l0Xd:::xKo:ok0KOx0OOXKOo::oO00xc;l0X000xll:;;;dNk:;;;;;;;dNMWWMWWMWMMM\r\n" + 
							   "MMMMMMMMWx;;;;;;;;;;;;;::;:::;o0x:;:;dXx;:lldxx0X00kkk:oXKONNx::kXKX0occ:;;;lK0c;;;;;::l0WWMWWMMMMMM\r\n" + 
							   "MMMMMMMMKc,;;;cloddc:;;:;;;:::cl:;::;dXxlxxdxodxk0K0kOock00Oxl::xX0xxoooldo:c0Xo;;;;:c::kWMWWMMMMMMM\r\n" + 
							   "MMMMMMMWx;;;:ok0XXNXOd:;;;::::::::::;oXkdkoxOOOdlclox0Oc:lOkc;;:x0dxxcokkxocc0Nkcc:;:c::dNMMMMMMMMMM\r\n" + 
							   "MMMMMMMXo,;;ok0Xxlox0Ol;;;;:::::::;:;oX0ddox0Oxdo::;:ldl;:kOc;::cloxlckNXOkdoKNklcccc::;lXMMMMMMMMMM\r\n" + 
							   "MMMMMMMKc,;;lx0Oc;:;::::;;;:::::::;:;oXk:ldcloll:;::;::;;:ol;;;;;:;coloxdxdcxXNxccc:;;;,lKMMMMMMMMMM\r\n" + 
							   "MWK0KXNXkc;;;:cc:;;:;;:;;;::::::::::;oX0ddddxdoooooooooooooooooddddddxkkxkkk0Xkl::;;;;;,oXMMMMMMMMMM\r\n" + 
							   "WXxdl:ccc:;;;;;:;;:;;;;:::::::::::::;cxkxddodooddoddoodololoolddoooldolooodxddl;;;;;;;;;dNMMMMMMMMMM\r\n" + 
							   "MX0Xk:,,;;;;;;cl:;:;:;;::::::::;;:::;:ol:lccxo:xdlxOdlklcxoddcxdlxdlkxlddcoOxkk:;;;;;;;:OWMMMMMMMMMM\r\n" + 
							   "MW00Xxc:,;;;;;okc;;;;;:::::::::::;::;ckdcxocOxckxcd0xo0ooOdkklxxlkklO0loklcOOkkc;;;;;;;dNMMMMMMMMMMM\r\n" + 
							   "MWNOxl:;,;;;::xXx;;::::;::::::::;;::;l0do0dlKxcOkox0xo0dx0xOklkklkOlO0clklc0Okk:;;;;;;l0MMMMMMMMMMMM\r\n" + 
							   "MMMN0kkkd:;cloxKKd:;;::;;;:::::;;;::;cdllkocxdckxoxOxokdx0xkxlkdcOkckO:oOll0xol;;;;;;:kWMMMMMMMMMMMM\r\n" + 
							   "MMMMMWW0o;;;;;;lOKd:;::;;;:::::::;:::okolkocddlkxooxdodokOddloxllxllxo:dd:odldc;;;;;:xNMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMNd;;;;;;;;:x0kc;::;;;:::::;;::;:c:coololldolloodxoddolclocldccdc:loc:::::;;;;;oXMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMKl,,;;;;;;;cddlc:;:;:::::;::;ldl:ldddolcccc::::;;:::;;;;:;;ldc:lolol:;:;;;;;lKWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWXkddo:;;;;;;;:::;;;::::;:ccckOllkxclddxdc::;;:::;::;;:::;ckk:cxl;:lodo:;;;oKWMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWN0d:;;;;;;;;;;:::::::clcdOkdkklloodxl;;:::;:::;;::;:::okdokd:looddc;;cOWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWN0o:;;;;;;;:::cccccldxkkxxkdloxxxl;;;::;;::::::;;coddxddxocdxxdc;;;c0WMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMNKkl:;;;;:cccloccccoodOklodcclkkc;;;::;::::::;;::cldOxcoo::lOx:;;:kWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWKo:::;:cccdkl:::clddccdd:;:cl:;;::;;;;;;:;;::;codoccxd;;;cc;;;;lKWMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWWkcc:::cclO0c;::;:;;:ooc;::;;;:ccodxxxxdolc:::;;;;:oo:;;;;;;;;;;oKWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMWWNxcc::::;lK0c;:;::;;;;;;:;;:ok0KXWMMMMMWWNKxcoxoc;;;;;;;;;;;;;,;;lKWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMWWWXxc:::;;;;lKk:;;;;::;;;;:::oONMMMMMMMMMMMMMW0ccx0KOo:;;;;;;;,;;;;;,lKWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWWWWWW0l;;;;;;;;;cdc;;;;;;;;;;;:lONWMMMMMMMMMMMMMMW0doookOd:;;;;;,,;,;;,,;;dNWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWWWWWMMMWKkko:cccllll:;;;;;;;;;;cokXWMMMMMMMMMMMMMMMMMWWWNNNXXOl;;;;;lxo::ccccdXMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWMMMMMMMMWNXXXNNNNXxoodxxkkkkOKNWWMMMMMMMMMMMMMMMMMMMMMMWWMMWX0000KXWNXXNNXNWWMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNX0000KXKKKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXkO0OkkkOkONNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKXNX00Okk0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 4:
			System.out.println(" ____       _   \r\n" + 
							   "|  _ \\ __ _| |_ \r\n" + 
							   "| |_) / _` | __|\r\n" + 
							   "|  _ < (_| | |_ \r\n" + 
							   "|_| \\_\\__,_|\\__|\r\n" + 
							   "");
			System.out.println("Traits: wise, unique, intelligent, crafty, determined, inventive, and intense.\r\n");
			
			System.out.println("Disabilities: acquisitiveness, ruthlessness, and nervousness.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMWNXK00XNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNX0Okxdl::;;:lxKWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOl:;,,:lclk0Oxc,:xXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO:;;:cdK0kKXNKdc;;xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0c;:kX0Okddox0Kx:;xNMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKl:lxkxl:;;;lOOo;;xWMMWNXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKl:xxoc;col:lOXx:;cdxdolcllodOKNWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKOkko:;::::;cxd:lKXx:;;:cokk0XK0OxdoxKWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxoc::;;;;::;::;;;;;oxo:;cd0OkkxOKNNNWN0o:oKWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXxc;;:::;::;:::::;:;:::;;;cdkxl;;::cod0NWWXo,lKMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKo:;;:cool::::;:::;;::;:::;::;:oxxdc;;;l0XNWO;:0MMMMMMMMMMMMMMMWWM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXd::;cdxxOKK0Oxc;:::::;:::::::::lokX0l;;:xXNXd;lXMMMMMMMMMMMMMMWWWW\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWMMWNNXOOXWMNx::::dOxcc0WWXd:;:::::::::::::::::d0xc;:o0WWOc;kWMMMMMMMMMMWWMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWXOO0OkkkkdONOc;:;ckkoldKW0o:;:::;;:::::::::::;:cc;;:o0NNOc;oXMMMMMMMWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWX0Okxddxkdol;::;:dxddxxdc::::;:::;;:::::::::;::coxOKKOd:;c0WMMMMWWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMWWN0xddol::::::::;;;;;:::;:::;;;:;;:::::::::::coool::::cOWWWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWKdoddcc::;:::::::::::::::::::::;;::::::::::;lk000OOkkkkKWWWWWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWW0l::;::::;:::::::::;;:::::;:::;;::;::::::::::oKWWWMWWWWWWWWMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMWXK0Ooc:::;;:;:::::::;;:ldl;;:::::;;::;:::::::o0WWMWWWWWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMWNK0oodccc:cccclodkOko:;;:::col:::::cclccccoKWWMWWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMWWNxkKdkko0XXXNNWWKxoooooxOKKdc:::cccccccccxXMMMWWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMWMXdOXdk0d0MMMMMMWWWWWWWWX0xolllccccccccccco0WMMWWWWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMWWWMWNXNN0K0d0WWMMMWWNXK0OOxlldOKK0Okdolcc::clcxNWKxold0WMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWXKXXKOxONMMMMMNKNNX0Okxdolc:cclccllodxOKXXK0000ko:oOd:;;;;lKMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWNXNWMWXo:kWMWWN0kxoc::;::cccccccccccllcccld0XWWKo:;::;:llldOXMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMWWN0xoxXWNOxo:;;;;:::cccccccclcccclcc::;;:lkKx:;;;:ckNNNWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWXOxddkXWNOl::c:::::clllcccccccc::::::::::;:;:ll:;;cxKWMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMN0xdodOKNWNOo::;o0koclxKklclcc:::;:;;:::::::;;;:;;:;;cOWWMWWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWNOook0NWWWWXdcc:::l0W0oxNXxcclddoc;;::;:::::;;;;;;;;;;;:lxkkkdkNMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMW0ooONMWMMMWKo:cd00OxxOKxkKxdxO0kodkxdl;;:;;;;;;;;;;;;;:cc:;;::loOWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWOcdNMMMMMMWKo:cclxO00Oddxdox00Oxl:;:d00d:;;;;;;;;;;;;cd0XXK00KXNNNWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMXo:0MMMMMWWNd:cc:cldkOOooOdcxkxdl:;;;co0Kl;;;;;;;;;:cxKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMNd:OWMWWWWWk::c:cdOKKOxxxodkxk0K0xc;;lxKNx;;;;;;;;;ckKXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMW0loKWWWWWXd;::;;:cc::xNKlxNKl:ccl:;:kXNNKOxdlc;;;;;;:clox0NWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWKxoxKNWWOc,,;;,;;;,lKKo;ckXk:;;;;;:looooooodxdl;;;;;;;,,;o0WMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWWWWWKxddxdc,,,,,;;;;,:lc;;;;ll;;;;;;;;;;;;;;;,;coolccccc::::oXMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWWWWWMMMWWNK0Oxddoollccc::::::;;;;::;::;;;;;;,,,,,;,,:xXXNXXXXKKXWMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWMMMMMMMMMMMMMMWWWWNNXXXXKKKKKKKKKKKK000OOOkkxxddddoxXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNK000XKKKKO0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOkkO0kOxxxOXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKKK000K00KKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 5:
			System.out.println("  ___       \r\n" + 
							   " / _ \\__  __\r\n" + 
							   "| | | \\ \\/ /\r\n" + 
							   "| |_| |>  < \r\n" + 
							   " \\___//_/\\_\\\r\n" + 
							   "");
			System.out.println("Traits: honest, contemplative, observant, determined, cautious, and loyal.\r\n");
			
			System.out.println("Disabilities: self-righteous, stubborn, petty, egotistical, judgmental, and overly cautious.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWK00OOKWMM\r\n" + 
							   "MMMMMMMMMMWXKOkxxkOKWMMMMMMMMMMMWX0kxxkO0XNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKOxdxkxdONW\r\n" + 
							   "WMMWMWNKOkxlcldxOKXNWMMMMMMMMMMMWWXKOkdoooxOO0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkdooxkclkOxoOW\r\n" + 
							   "MMWNKkxdodO0KNWMMMMMMMMMMMMMMMMMMMMMMMWWN0OxoxxxKWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKdlokKNNXkldO0xdK\r\n" + 
							   "WMNxlxOddKWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWXkdxxok0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOcl0NWWMWWWKkkk0NW\r\n" + 
							   "MNxlx0xl0WMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMWWKod00xlxNWMMMMMMMMMMMMMMMMMMMMMMMMMMW0::0WMMMMMMMMMMMMMM\r\n" + 
							   "MKookOkloOXWWWMMMMWWMWWMMMMWWNKkdddk0XNNX0kxdx00Oxod0MMMMMMMMMMMMMMMMMMMMMMMMMMMWx;:kNMMMMMMMMMMMMMM\r\n" + 
							   "WKdkOkkkkxldOOkO0XXX0Okxxddddoc;;;;:clxOkocoOKXK0kxxKWWWNNWWWMMMMMMMMMMMMMMMMMMMWKdc:oxO0KXWWMMMMMMM\r\n" + 
							   "xkd:;cOKOxkKNKolkOdc:;;;;::;;;::;;lO0xd0NN0kxk0Ol::okxddoloodxOKXWWMMMMMMMMMMMMMMWN0xolllooodx0NWWWM\r\n" + 
							   ":,::,;::;lOOkkKNXkc;;;cccdlcooc:;:oKNNKkk0XKOl:ccccll::::;;::;;:codxkO00KKXXKK0Oxdoc:::::cldxdloONWW\r\n" + 
							   "d;;lddddol:;;cdol:;:;:xkdooxxdl:;;:cdxxo::cccdk0KKKXOl;::;;:::;:::;;;;:::ccc::::c:;;;;;;;::coOKkldXM\r\n" + 
							   "Nkc:oONWXKxc;;;;;;;;coxOd:cldoxxc;::;;::::::clox0NNKo:::::;;:::;;::;:::;:::::lkkl:::loolc::::cxXk:dN\r\n" + 
							   "MWXOxodkOOx:;:;;;;;;:ldxxdoodxolc;::::;;::::lxkkxolc;:::::;:::::;:;;::;cl:;;l0W0l;l0Kxolcc::::;d0l:0\r\n" + 
							   "MMMMWWX0OOxl:oxdoc:;;:ldxdOxcxx:;:::codxdc::ldoc:;::;::::::::::::::::;;lOOoclxXWXddX0lcdxdc;;;,;l::0\r\n" + 
							   "MMMMMMMMMWW0c:xOk0kl;;:::ldc:::::;ck0kOkclo:;;:::::;;::::llcodc:::::;::cxXXK0kxx0xxXOd0X0xol:;;,,:kN\r\n" + 
							   "MMMMMMMMMMWXo:xxdXN0l;;;:;;;;:;:;ckXXkxkldd:;;:;::;;;;:looxkdkxlxl;::lolloxOkxdlllooo0Kd:;;;;;;;,oXM\r\n" + 
							   "MMMMMMMMMMMW0loOkkxkkl;::::;:;;;cxkxkkOxoxl;::;:::::;;cldxxxxkxxkdc:cdO00K0Oxocc:::coxkkOOxc,,;;,c0M\r\n" + 
							   "MMMMMMMMMMMMWKoldoccll:;::::::::clccodoodl::::::;col::lddkxc:lxOOkoccclxxxxkxl::::cllxOkdoddc,;;,;kW\r\n" + 
							   "MMMMMMMMMMMMMWXxc;;;;;::::::::::;:;;;cdxc:::::;:;coxo:lldkxxodkkkocccllldOXXxdklodldOOOxl;;::;,,,;xW\r\n" + 
							   "MMMMMMMMMMMMMMWWKxc:;;:::::::::;:::;ckOl;::;::::;cokx:;:ddoOxldkxocccloxOKOocOXddK0dodd00l;;;;,,;;xW\r\n" + 
							   "MMMMMMMMMMMMMMMMWW0l;;::::;;::;;;::;dXx::::::;:::coOk:ccllloocccc::::::::c:;c0Nx:lOXx;;lxl;;;;,,;,dN\r\n" + 
							   "MMMMMMMMMMMMMMMMMNkc;cc:;:::::;ldl:;o0k:;::::::::ldOOlcccccccc::::::::::;:cldkdc::x0o;;::;;;;;,,;,dN\r\n" + 
							   "MMMMMMMMMMMMMMMMXd:;lOd;:::;;:::x0o;:oOd::;:cccccloOOlcccllc:::::::::::::::::;;;:loc;;;;;;;;,,;;;,dN\r\n" + 
							   "MMMMMMMMMMMMMMMWO:;;o00OO0OxkOOk0Ko;:;oOo:ccclccclx0Olcclcc::;::;::::::::;;::;;;:;;;;;;;;;;;;;;;;,oN\r\n" + 
							   "MMMMMMMMMMMMMMMMKo;;:xK0ddxOkdxOXKo:::cOxcllcccccoOKx::::::;;::::;;:::::::;;;:;;;;;;;;;;;;;;,;cl:,oX\r\n" + 
							   "MMMMMMMMMMMMMMMMNx:lO0o:;;:dl;;:lOKxccdxlclllcccckXKolxxddolllol:::::;::;;;;;;;;;;;;;;;;;;:lxOXKl,oX\r\n" + 
							   "MMMMMMMMMMMMMMMMXlc0Nx:cccokdldddxXNxllcccccc::;o0Nk:ckKXX0kkkkd:;;;:;;::;::;;;;;codoodxk0XNWN0d:,oX\r\n" + 
							   "MMMMMMMMMMMMMMMW0:cONk::cdkkOO0OdoKNklcc:::::;:;okxl;:ldkkxxxkkkkkxxdolc:;:;;;;;;:dkOO0NNXNN0oc;,,oX\r\n" + 
							   "MMMMMMMMMMMMMMMNx;;lOKOdoodxxxxxxOX0o::::;:::::;:okkO0KNWWWMMMMMMWWMWWN0l:ol:;;;;;;;;;;ooloxd;,,;,oN\r\n" + 
							   "MMMMMMMMMMMMMMMXo;;;:oxkOOOOOOOOOko:;;;;:::::::::kNWMMMMMMMMMMMMMMMMMMWXo;lxOkdc;;;;;;;;,,,;:;,,;,oN\r\n" + 
							   "MMMMMMMMMMMMMMWKl;:::cc::clccokOOkkxoc;;:::;;;:;:kNWMMMMMMMMMMMMMMMMMMMXo;;;cx00d:;;;;;;;,,;;:oo:,oX\r\n" + 
							   "MMMMMMMMMMMMMMNkcccccccc::::c0WMMWWWN0l;::;;;;;;:xXWMMMMMMMMMMMMMMMMMMMXo;;;;;cd0Oc;;:dxxkOOOOOx:,cK\r\n" + 
							   "MMMMMMMMMMMMWW0lcc::c:::;;;cOWMMMMMMWWO:;::;:;;;;oOXMMMMMMMMMMMMMMMMMMM0c;;;;;;;:xkc,;:ccokKx:;;;,:0\r\n" + 
							   "MMMMMMMMMWWWWXdcllc;;;,,;;;xNWMMMMMMMWKl;;;;;;;:cloOWMMMMMMMMMMMMMMMMMW0ddoolc::;;lc;,,,,;;::;;,;,c0\r\n" + 
							   "MMMMMMMMMWWWWKOOxoodkdodxolOWWMMMMMMMMNxokOkxoldocckWMMMMMMMMMMMMMMMMMWKO0OO0Okxdoc;cooolcccclcc:,lX\r\n" + 
							   "MMMMMMMMMMWWMWK00K0kO00OkxONWMMMMMMMMMW0kO0KkloOklckWMMMMMMMMMMMMMMMMMMMWWNXNXXKK00xdkxxk0OkkkkxocxN\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWNWWWWWNWWWWWWWWWWWWWNNNNNXKXNWXXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNK000Ok0OOO000KXNW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXOOKOOKK00XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN0OKOOK0kOXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKXXXXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 6:
			System.out.println(" _____ _                 \r\n" + 
							   "|_   _(_) __ _  ___ _ __ \r\n" + 
							   "  | | | |/ _` |/ _ \\ '__|\r\n" + 
							   "  | | | | (_| |  __/ |   \r\n" + 
							   "  |_| |_|\\__, |\\___|_|   \r\n" + 
							   "         |___/           \r\n" + 
							   "");
			System.out.println("Traits: outspoken, adventurous, unconventional, and enthusiastic.\r\n");
			
			System.out.println("Disabilities: aggressive, arrogant, short-tempered, and anxious.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMWWNOocokNWMMMWWXK0OOOO0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMWXd:;;;;oKWN0xol:::cll:xNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMWXo;;:clollxo:;;cdOKNN0cdNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOOXWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMWXxodk0kodkd:;;;cOWWWKkockWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXd:,,:oxKWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWXOoo00ok0o:cdc;:;:xXWW0o;dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKl;,,,;clkNMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWKOdc;;;cdo:oo::c::::::o0XKo:kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOc;;;,:xXNWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMWXkoc;;;:::;:c:;;;:dOKKkl:::cc::xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOc;;;::lKWWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMN0dc;;;:ol:lc;:oOOkdcckNWNKkc;:::;dNMMMMMMMMMMMMMMMMMMMMMMMMMMWWKl;:oOKx:o0NWWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMWWXko:;;cc;cddllc;;cOWWXd::OWWXxc:::;:xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMKo:oKWXo;;;cdxk0KNWMMMM\r\n" + 
							   "WWNXNWMWKkoc:cdOOkxdoodxdc;:;xNMNx:;dXMW0l::::oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0xxxdc;;:x0l,;:oONWWW\r\n" + 
							   "WXOO00Od:;;;cxKXWNXXKK0kl:;;cOWWXd:;oXWW0dc:::dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMWWNKK0kkOx:;;;:cdKWW\r\n" + 
							   "KKKKOxc,,;:looodk00xddl:;:::dXWXkl:;dXWXo::;:::d0XXXXNWMMMMMMMMMMMMMMMMMMMWWWWNXKOkkk0XWWXOocldxxx0W\r\n" + 
							   "K000x:,;:llcccooooxdc;:::;;:cdkl:;:;cd00l;::c:;::ccccloONWWWMWWWWWNXKK0Okxddoolc:;;;;:lx0XWXxlxOd:lK\r\n" + 
							   "XXNNX0o:;cooc;:okocl:;:;:;;::::okdc:;:cc:cx0Kd:::okxo:;:ldkkkkxxdolcc::;;;;;:cc:::c:;:cccokXNk:,,,:O\r\n" + 
							   "MMMWMWN0xc;llcx0XXK0kdl:;;;ldc;oKNKkl::;cOWWWOc;;dKNXo;:cddoc;;:lool:;cxOOo::dKOllk0klcc:::lOx;,;,:0\r\n" + 
							   "MMMMMMMMWXOkxONMMWWMMWXOl:;l0OcoXMWWXOl;l0MMWO:;;o0XXo;;dXWNx:;oKWWOc;c0WW0l:l0W0odXW0l;;;;;:;,;;,dN\r\n" + 
							   "MMMMMMMMMMMMWWWWWMWMMWWKo;;dXN00WMWMMW0cc0WMNd;;:dKXO:;:xNMNx:;lKMWk:;cOWMKoccOWNkl0W0c;;;;;,,;,;oKW\r\n" + 
							   "MMMMMMMMMMMMWWOooxOOOkdl:cdKWWWWMMMMMMNdc0WWO:;;l0NKo::oKWW0c;;oXWXdc:oKWWOcccOWWkcOWk:;;;;;,,;:dXWM\r\n" + 
							   "MMMMMMMMMMMMW0c:d0KK0000KXWMMWMMMMMMMMWK0NMKl;:l0NNx::dXWWXo::dKWNxcldKWWKoc:dXWWkl0Nx;;;;,:okOKWMWM\r\n" + 
							   "MMMMMMMMMMMMMNkcdXWWNX0O0KXXXKKKNMMMMMMMMMWk::dKWX0o;dXWMWk:cONWW0olxXWMNxccxXWWKoxNWKxc:;,oXMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWNXOllxxoc:::cdkO0KNWMMMMMMMMMNx;lKWMX0o:OWWWWkckNWWW0ldXWMMKl:xNWMXxkNMMMWXOd:dNMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWklol:;;:ok0kcoO00KXNWMMMMMMMMWk:dNMMWNkl0WWWWKdOWWWMKodNWWWKclKWMW00WMMMMMWMKldNMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWO:o0Od:cOWW0l;:;::cldxO0KXWMMMXdxNMMMWNKXWWWWWXXWWWMWK0NMMMNxoXWMWWWMMMMMMWMNdoNMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMKllKW0l;l0Xxcdkkdl:;;;;:oONMMMWKKXNNNXXXXXKKKK0KKKKKXXXNNNWWNKNMMWNK0KKKK0KXXdlKMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMNd;xNO:;:locxNWWWNKkxxk0XWNKOxddddxxxxxxxxddooollllllccllodxxxkOO00o::::;;::c::kWMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMW0c:kKo;;;;l0NWWMMMMMMMWN0dodxOKKXXNNWWWWWWNNNNNXXXX0o:;:lx00kc;cddc;;;;;:::::;cKWMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMNk:ckkc;;;:clodk0XNWNKOdoxKNWWWMWWMMMMMMMMMMMMMMMMMKlcdc;:xXXoc0WNKkllx0KKKXX0loXMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMNx::cldxkkdc;;;:codolcdKWWWWMMMMMMMMMMMMMMMMMMMMWNx:xXkc;:xOcoXMMMMNOk0XNNNWWOcdNMMMM\r\n" + 
							   "MMMMMMMMMMMWW0xollxOXWWWWWKxlc::ccccxXWWMMMMMMMMMMMMMMMMMMMWNKOko:;dXN0dccc;dNMMMMMNx;:clllol:;xNMMM\r\n" + 
							   "MMMMMMMMMMMWO::kXNNKxodx0NWWNK0OxlcxXWMMMMMMMMMMMMMMMMMMMMWKdc:lxOd:dXWW0l;:kWMMMWWNxoxdollc:,,cKMMM\r\n" + 
							   "MMMMMMMMMMMKc,dNMWWNOc;:lkKNWWXxlcdKWMMMMMMMMMMMMMMMMMMMMW0l;:dXWWOc:xKOlcokNWWWWX0d:lOXWWNKl,l0WMMM\r\n" + 
							   "MMMMMMMMMMWk;;xWMMWWWKdlccldxdlld0NMMMMMMMMMMMMMMMMMMMMMMKo;;cOWWWNOl:::o0NWWXOxkkkOd:;cxKKo;oKWMMMM\r\n" + 
							   "MMMMMMMMMMWx;;o0KKXXNNNKkl:;:lkKWMMMMMMMMMMMMMMMMMMMMMMMM0c;;:codxkko::xNMWNkc;oXWWWWKkl:c:;oXMMMMMM\r\n" + 
							   "MMMMMMMMMMW0lllloodddxxxoc:okXWMMMMMMMMMMMMMMMMMMMMMMMMMMNkllloooollloONMMM0c,;cdddxxxxd:,:xNMMMMMMM\r\n" + 
							   "MMMMMMMMMMMWNNNXXXXNNNXXXKKNWWWMMMMMMMMMMMMMMMMMMMMMMMMMWWWNNNNWWWNNNWWWMWWXxooooooolc:;:o0WWWMMMMMM\r\n" + 
							   "MMMMMMMMMWNWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWWNNNWNNNNNNNNNNNNNNNNNNNNNNNNNNXK0KXNNWNNNNNNW\r\n" + 
							   "MMMMMMMMMWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXO0KKKKKKKKKKKKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "MMMMMMMMMWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNO0NKkkOkxkOOOKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "MMMMMMMMMWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXNXXKOOKXXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "MMMMMMMMMWNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 7:
			System.out.println(" ____       _     _     _ _   \r\n" + 
							   "|  _ \\ __ _| |__ | |__ (_) |_ \r\n" + 
							   "| |_) / _` | '_ \\| '_ \\| | __|\r\n" + 
							   "|  _ < (_| | |_) | |_) | | |_ \r\n" + 
							   "|_| \\_\\__,_|_.__/|_.__/|_|\\__|\r\n" + 
							   "");
			System.out.println("Traits: intuitive, even-tempered, gentle, faithful, compassionate, and clever.\r\n");
			
			System.out.println("Disabilities: pessimistic, insecure, vain, overly cautious, and finicky.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKK00OOOOOO0KXXNWWWMMMMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMWN0kxdddddxddddooollloooddxxkkkdxKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMWKkolldk0XWWWWWXNWWNXXXXXKK0Okdc;;:xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWN0occx0NWWWWXkxOxx0000KNWMMMMMWNk:;ckNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMWKo:oONWWMWXxol;;:;:co0WMMMMMMWN0d::o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWOcckNWWWNKOdodl:;;;;ckXWMMMNKkdoccd0NWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWOclKWNXOdodOXNW0c;;cxKNWWNKkdoddk0NWWWWNNXKK0000KKKKKKK00000000KNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMW0coKNW0lloOKOONWOc;ckXWWXOxxk0XWWWWX0kxxxkkkOO0KKKKKKK00Okxddc;;xNMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMXo;kNOkock0xl:dNNx::xXNKOk0XWWX0kxxddxk0KNWMWWMWWWWMWNWMWWWWWXk:oXMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWO:;lxl;cxxl:;lKWOc:d0Oxk0K0kxddolcdKNWMWWWNXNNKkOKKOOKKKXNNWWXxl0WMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWk;;;;;;::;;;cOXkc;clccdxolcokKXK0KNNNN0kkkoldoc:cc::lkKXNWNX0o:kWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWx;;;;;;;;:;;oOdc;:;::::lod0NWN0O00koooccllllc:::::cld0XXNXkl::xNMMMMMMMMMMMMMMMMWWM\r\n" + 
							   "MMMMMMMMMMMMMMMMWxll:;;;;;:lxOko:;:;:;cOXXNXxooldxxxkO0000000ko::ldkXWWWWXkl;cxNMMMMMMMMMMMMMMMWWWWW\r\n" + 
							   "MMMMMMMMMMMMMMMMNddOl;;:;;lxxdl::::lxxOXOxxoodxkkkkxddodxO0K0koclONWWWW0dc:;lONWMMMMMMMMMMMMWWMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMW0co0o;;codo:;;:::;l0Xxoo:::cllc::;;;cox0K0Oxdok0XNWWWKxc;:;:cdOXWWMMMMWWMMMMMMMWMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMNx;lOo;:oxdl:::;cdldKk:;:;::;:clodxkkkOkdoookXNWMWNKOdc;;;:;;;;:cd0NMMMWWMWWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMW0c;oOxoxdc;;::;ckKdlo:::;::coxxkkxoollllld0XNWWNKkoc:;;;;;::::::ccld0NWWWWWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWKl;;cdo::::::::;:loc::;:;;;::cc::oxxkOKXNNNNNKOxo::;;:;:::::cccllcccclxXWWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWNd;;;;;;;;;::;;:;;::;;:;;:ododxkOOXWMMWWWXKOxoc:;::;:::;:cccccccccllcc:;oKWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMWO:;;;;;;;;:;;::;::;:::;:oOXNNNNNXXK0Okxdoc::::;:;:clccolccccccldocc::;;;;lKWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMW0l;;;;;;;::clllc:;;;::;::cloooollcc::;;;:;::;:;:lxkxdcl0XklllloOXd;:;;;;;;;dXMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMWNx:;;;;;;:lk00KK0KOxdollllc:;::::::::::::::::;:cokOkoccco0WNKdlkXWXx:;;;;;;;;:OMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMNx;;;;;;;:d0kolloOXWMWNNNNN0l;:::;;;;;:::::::;:d00kdloloooxOX0o:xXKxlllc:cc:;;;xWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWO:,;;;;;:xKOkkl;:o0WMMMMMMNkc;:::ldxkkoc:cc::oOKklloOKKXXx:;lxl:odc;cOXKK0d:;;;dNMMMMMMMMMM\r\n" + 
							   "MMMMMMMMNo,,;;;;;oKkxK0o;:;lKWMMMWXd:;:;:xXWNOdl:clllxX0occcccd0XKOdlccodoccok0KXkl:;;;;xWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMKl,;;;;;;dXd:cc::::oKMWWW0l:;;:lONNNOlcdxoclkX0ollcc:;col:::cclOXOlcc::col;;;;,:OWMMMMMMMMMM\r\n" + 
							   "MMMMMMMM0c,;;;;;,dXkcccc::l0WMWNOc;::lkXWX0dllONNkokXKoclcc:::lO0Okdlc:lol:coxkO0x:;;;;oXMMMMMMMMMMM\r\n" + 
							   "MMMMMMMM0c,;;,,;;dNNK00000KXNX0d:;::dXWWWNOolkNWOdx0Nk::::::lkKXNNkc;coc:oo::o0NXK0d:,;lk0XWWMMMMMMM\r\n" + 
							   "MMMMMMMM0c,;,;,,;lxdlccloooolc:;;:lkXWWWNkllxXWKlo0XNx:;::::loolooclxKOc;dKOdllollll:;,,,;ckNWMMMMMM\r\n" + 
							   "MMMMMMMMKl,;:;,,,,;;;;;;;;;;::c::o0WWWWWOlcdXWW0co0XWOc;::::;;;::;lOWWKockNWXd:;;;;;;;,,,;,:0MMMMMMM\r\n" + 
							   "MMMMMMMMWk;cOkc,,,,;;;;;;;;:ccclxXWWWX0xl::xKKOo;coOWNkc;:;::;;;:;cOXkocccd0Xo;;;;;;,,,,,;,lKMMMMMMM\r\n" + 
							   "MMMMMMMMMNxcldc;,;;,;;;;;::ccclkNWWXKOd:;:;:cc:;:;;lONN0dc:;::;;:;:do:;;;;;cdl;;;,:oo:;;;:dKWMMMMMMM\r\n" + 
							   "MMMMMMMMMMWKxoc:;,,,;;:;;:cccclxkxoc:;;;;;;::::;::;;:dOXNXOxoc:;;;;;;;;;;;;;;;;;;lONNKOO0XWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWNK0kdl:cclxxdlc::;;;;;;;;;;;;;;;;;;;;:::cdOXWMWX0kdl:;;;;;;;;;;;coOXWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWX0kdlccc:lol:;;;;;;;;;;;;::coddolcc:::cx0XXNNWWWWWWXd;;;;;;;;;ckXWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWXOdlcc:::::;;;;;,,;;;:codkO000Okxdolcc::;:lodooooooodddc;;;;;;;,,;dNMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMNkl:cclodl;;;;,,,,;coxOKNWWMMWKo:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,,,;dXWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWN0kkO0XWNklollooxk0NWMMMMMMMMNd;;;;;;;;:cccccc:::;;;;;,,,,;;;:clodk0NWWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWMMMMMMMMWWWWWWWWWMMMMMMMMMMMMNOoooddxk0KXXNNNXXKK0OkkxxxxkkO0KXNWWWMMMWMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNX000KXKK0O0KK0OKKK0OKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKkkkOOxkkkOkOxkOxkkk0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKKK00000K00KK00KKKKKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 8:
			System.out.println(" ____                              \r\n" + 
							   "|  _ \\ _ __ __ _  __ _  ___  _ __  \r\n" + 
							   "| | | | '__/ _` |/ _` |/ _ \\| '_ \\ \r\n" + 
							   "| |_| | | | (_| | (_| | (_) | | | |\r\n" + 
							   "|____/|_|  \\__,_|\\__, |\\___/|_| |_|\r\n" + 
							   "                 |___/             \r\n" + 
							   "");
			System.out.println("Traits: courageous, intelligent, charismatic, and passionate.\r\n");
			
			System.out.println("Disabilities: impetuous, inflexible, and brash.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKkdokNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXKNMMMMXd;;;lKWMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0c:x0XWWWKo;;;dNWWX0OOKWMMMMMMMWNOkONMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWM0c;::o000Kkc;;:dOxc:loOWMMMMMMMNdo0NWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkc;::::::oxc;;;:;:xXWWMMMMMMMMWkdk00OOO0KNWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOl::;;;cONOc;;;;l0WNKOOKXO0NWMWX0000000OxONMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOd:;;cOWW0o:::okkdokOdodOOxkKNWWMMMMMM0xXMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMN0O0KNWWMMMMMMMMMMMMMMMMMMMMMMMMMMWWNkc;;cdO0kl::ldk0KNWNKXNNKOkx0WMMMMMWOkWMWWWWMMMM\r\n" + 
							   "MMMMMMMNXWMMMWWN0kxdooxOKNWMMMMMMMMMMMMMMMMWKXNNNXK0dllooc:::::;;;lxOOkkOOkkONNxckNMMMMKooxxkkOOO0NM\r\n" + 
							   "MMMMMMWN0xkO00OOkxdoc;;;:lx0NWMMMMMMMMMMMMMWKkdllc:cx0KOdc;:;::::;::::dKKOO0xxOo;:OWWWXddxc,dKNNKdkN\r\n" + 
							   "NKOkk0KNN0o:;;;;;;;;;cloc:;:dKWNWMMMMMMMMMMWWNKkdlcccdkOxl:::::::;lxlc0Ndlddoc:;;;cxOkl:odcdXWMMWOo0\r\n" + 
							   "KkdoolcldkOkl;;;;::::l0XOko:;o0kkNMMMMMMMMMXkOK0xlcldkOxl:::::;::;oKkcoO0kko;;;;;;;;;;;;;cONWMMMWOdK\r\n" + 
							   "WMMMWN0l;;:ccloxkkkkkkKKdoOx::dllKMMMMMMMMMXo:ldl:;cdkko:::::;:::;l0NKOdlol:;;;;;;;;;;:::OWWWMWW0x0W\r\n" + 
							   "MWWNKko:;;;;ckXXklcccdOko:x0o;::lKMMMMWWNKKOo:::;;:;:dkkdc:;;;:;;cloxkxl:looc;:;;;:ldOKOkXWWMWNOkXWW\r\n" + 
							   "W0dl;;;;;;;;;:lOXx:lkK00Kk0Kl;::xNMMNKkdlc:::::::;;ckNKdc:;::;;;:xkl;;;ckK0dccodkOKNWMWWWWMMWNkkNWWW\r\n" + 
							   "k:,;:ccccc;;;lx0KdcOWKdxNWNx:;:oXMWKkdccl::::;::;cdONWOdddo:;;:;:coxc;;:kKd;:xNWMMMMMMMMMMWWMKx0WWWW\r\n" + 
							   "llk0KX0kdl::xXWNKkdONNKXWKd:;:oKWWWNKkxOd:;cdd:;:oxkO0000Oko:::::::coo:;:dOd:cxKWMMMMMMMWWWWMNkx0XKK\r\n" + 
							   "0NWN0dc;;;;cdxdookK00XWXkl:;;l0WMWNOlo0x::::loc;:oxkOoc::d0d:cc::::::c:;;;clc:;l0WMMWWMMWWWMWMN0O0KX\r\n" + 
							   "WWKxdxd:;;;;;;;;;;lxkkxooocccoXWWKxl:x0l;oOkl:;:xXWNKkolxXXOO0xl:;:c:::;:::::::cd0NNNWMWWMMMMMMMMMMM\r\n" + 
							   "MNKXWXd;,;coko:;;;;:ldk0NKloxoKWWXKxlOO::dXWN0koldkkxdodkxxxdx00dxkoloc:ckklcdxolldodXMMMMMMMMMMMMMM\r\n" + 
							   "MMMN0dloxOXNKl;;cdocdO00Od:okd0WWWKlc0k:::oOOkkd:oO0x:::lxo:l0WNNKd:okxk0OdllldOOdl:oXWWMMMMMMMMMMMM\r\n" + 
							   "MMMWXXNWMMWXOxxOXWXd:;:::;;oOxOWWXo;c0Oc;;:::;;::o0XNd:lKW0lxX0kxdo:lk0xooddxoclxkxldXWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMW0l:ldoc:lOxOWNkolcOKo;::coddc:kNWWKdxNW0cclcokXKdclldOXNWKl:lxOO0XWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMNdl0K0OooOxOWNXKo:xXk:;l0WWWOlxXNWMNNWXxlox0XWWXxld0NWWWXxokXWMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWk:llcc:l0xkWMWk:;:xOo;cdkxxo::ld0XWWWWNXNWWWWN0OKNWWWMWNNWWMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMNNWMMMMMMMMWO:;:::;o0xxNWWOoxklcc:::;::::::coxkkkO0000000O0KNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMW0dxXWWWMMMMWk:;coc;l0xdXMMWNWKl;:odc::::cdO0KOocccclcccllolclkXWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMNx:c0WWMMMMNxlx0XOlo0koXWMMMWKOklck0xlcco0XXOoccllcccd0XNNXx::o0WMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMNkcl0XOdONWNxoxxxxol0koKWMMMMMWW0lcd00kxodddoccclcc:lKWWWWXd;:;l0WMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMWNx:oKKd:;c0WNd;;;;;;lKkdXWMMMMMMMWKxdodO00OOkdc;:::cloxkxddo:;;::oXMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMWO:;loc;;;;oKO:;;;;:;dXxkWWMWWWWWWWWWNkodkOOOOoc:::;:oOkc;;;;;;;:;:OWMMMMMMMMMWNXKKXNWWMMMMMMM\r\n" + 
							   "MMMMMWKl,;;;lxko;;lc;;;:c:;kKddXMWWWWWWMMWWMNNWWWMMNK00Od:;;l0x:ldkxxxoc;dXMMMMMMNOdoc::::l0WMMMMMMM\r\n" + 
							   "MMMMMXo;;;,:xNWXkl:;:odk0koodlo0NWWWWWWWWMMWWMWWWWMMWWWKd::;cOOoONXNWWWOcc0WWMMMWKo;;;oOOkxKWMMMMMMM\r\n" + 
							   "MMWWNx;lo;,;;dXWWXOll0WNK0xclxxoodxOXXkkXWWOxkKNNOdxk0XKx::;c0OclolokOKOc;cokXWMMWOcc:coodxkKWMMMMMM\r\n" + 
							   "WXKOo;;kk;;lc,dXMWWOcoxl::cccxK0xo:cdd:;lxOdcclxkolllllooc:ckKd::;;;:::c:;;;;cONMWxcdc;ldo::kNWMMMMM\r\n" + 
							   "N0dlclkXk;:Ok;:0WWWNxcc:::ccdkkkO0OkkxxxkOOOOOOOOOOOkkkOOOOOOocll:;:;;;;;;;;;;:kNNdld::0WNkOWMMMMMMM\r\n" + 
							   "MMWNXXKxc,lKKllXWWWWXxc:::cd0NNkccldxxxxxdolc:::::coxxollllc:l0NNOl;;;;;;:c:;;;:oo:;;;dNMWWWMMMMMMMM\r\n" + 
							   "MMMMWN0kxx0WXOKWWWMWWXxc;:dKWN0l;;;;;;;:d0x:;:;;:::lOXKo;::;;:o0NWk:;;;;;dKk:;;;,,,;,;kWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWWWWWWWWMMWWW0o:cdkdc;;;;;;;:l0Xx:;;;;;;;:dKKo;;;;;;;oKXd:;;;ckNMWKxooddl;,:OWWMWMMMMMMMMM\r\n" + 
							   "MMMMMMMWWWWWMMWMMMMMMMMMWKkoc:;;;;;;;;ckOd:;;;;;;;::ldocclclcccldoclodOXWMMMMMWWWW0c,:xXNNXXWMMMMMMM\r\n" + 
							   "MMMMMMMWWWWMMMMMMMMMMMMMMMMWX0OxddoooooddddxxxkOO000KKXXXNNNXXXXXXNNWWMMMMMMMMMMMWNk:;;:llo0WMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKOxddx0WWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN0k00OO0X0O0000000000000XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN0k00OOKKOkkkkOkkOOOk0KOKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXKXNXNNXKXK0OOKXKXNXNXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 9:
			System.out.println(" ____              _        \r\n" + 
							   "/ ___| _ __   __ _| | _____ \r\n" + 
							   "\\___ \\| '_ \\ / _` | |/ / _ \\\r\n" + 
							   " ___) | | | | (_| |   <  __/\r\n" + 
							   "|____/|_| |_|\\__,_|_|\\_\\___|\r\n" + 
							   "");
			System.out.println("Traits: wise, enigmatic, intuitive, sympathetic, mesmerizing, sensual, and beautiful.\r\n");
			
			System.out.println("Disabilities: hedonistic, vain, malicious, overly materialistic, and duplicitous.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWNXK0OOOOO00KNWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWN0kxxkkxdl:;:lc;,,;;cookKNWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxl:;cxxlcodoc;lOd;,;;xk:,:oKWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0kd:;;oOxoookkc,;dx;,,lOx;,;,:OWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNWMMMMMMMMMMMMMMMMMMMWKdodc;;;colxklco:,:cllc:::;,,;c::OWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkkNMMMMMMMMMMMMMMMMMMWOc;;;;;;;;:ldxl;;lx0XNNNXOccdxkkc,oNMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOo0WWMMMMMMMMMMMMMMMMWOc;:;;;;;;:xKOOx:dXWMMMMMMWx:lol:;,lXMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOld0XNWMMMMMMMMMMMWWWXo;:;:;;;;::ldkxcdXWMMMMMMMNd;;;;;,,oXWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOxkOOkOOOOOO00KKKKK000kc::;;;;:::::;;:oKWMMMMMMMWOodlc:c:;kWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMW0dKWWWWWNXK00OOOOOOOOOO00K0Oxolc::::coONWMMMMMMMMKl:dkxxxclKMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0XWWNXKK0OkkkxxxxxxxxxkO0KXXNNXK00KXWWMMMMMMMMMNd;;;;;;,:kWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMWWWXKOkxdllc:::;lkxl:;;;;;;ldc:cldxOKNWMMMMMMMMMMMMNxloc::;;;dNMMMMMMMMMWWM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWWX0kxol::cxOdc::::::dKKd:;:;::dXOc::;:llokKNMMMMMMMMMWO:cdkxxo;lKWMMMMMMWWWWWW\r\n" + 
							   "MMMMMMMMMMMMMMMMWWX0kxxdc:::;:::l0N0l::;:;c0Nk:;::;ckNKo;:cOXd;:coONWMMMMMWKl;;;;::;cOWMMMMWWWWWMMMM\r\n" + 
							   "MMMMMMMMMMMMWWXOdlc:;cxO0Oo:;:::;oXNx:;;;:codc:::;;l0Kxc;:xXOc:::;:lONWMMMNxcc:;;;;;xNWWWWWWMWWWMMMM\r\n" + 
							   "MMMMMMMMMMMNOo:;;;;;;;::dXXd:;;;:lx0kxxkOO00000OOkxxxdc::oOd::ldxxkdcdKWWWKloxxkkd:c0WWWWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMWKo:coooc:;;;:::dOxooxO0KXNWWMMMMMWMMMMMMMMWNX0kdc;ckXXXKKOl;l0WW0l::lool:oXWWWWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWKl;ldkO0K0kl::clxOKNWWWMWWNXKK000KXXNWMMMMMMMMMWWKkoodlccc::::l0WXdcloodocxNMWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWXo;;;;;;:lxkookKNWMMWWNXOkdoc:::::oolodkKNWWWMMMMMMWXxc:::::::ccdXNkldkkkd:oXMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWO:,;,;;;;;;:xNWMMMMWN0dc:lddxo:;;:xOl;:;codkXWMMMMMMMWOl:oxO00OdlkN0occ::;;:kWMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWk;cxkkkxdc:xNMMMMMW0occc::;cdkxxkxkOdl:lko;;l0WMMMMMMMW0odkkk00xcoKNk:cdxkkdoOWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWx;ldoloxOxl0MMMMMW0lcdxxocd0NWMMMMWWWXOkd:;:coKMMMMMMMWNxccccclccl0WKoldolll:cOWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWk;,,;;;;:;lKMMMMWXo;::::ckNMWMMMMMMMMMMNOoclxdOWMMWWMMWKdccccllc:l0WWk:;;;;;;;cOWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMM0c,;;;;;;;c0MMMMWO:;:;;;lKWMMMMMMMMMMMMMMNX0OOKWMMMWWWNkoxxdoc::;oXWW0c;:clolc;:OWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMNo,;coxkkdckWMMMWk:cdxxdo0WMMMMMMMMMMMMMMWWWWWWMMMWWWW0loOKXN0o::kWWMXlcxkkkkOOooXMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWO::x0OOOxclXMMMWOcoxoll:oKWWMMMMMMMMWWMMMMWWWWWWWWWNkc;;::oKW0ldNMWWKl;:;;;,:olcOMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMNd;;;;;;;;:xNWMMKo;:::;:clx0XWMWMMMWWWWMMMMWWWWNX0xl:::;;::lxdkNMMWNx:;;;;;,;;,;OWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMWKl,;;;;clllkNWMW0c;:;cxko::ldkO0KKXKKXKK00Okxdoc:cxdc;;;:;:lONWMWNx:;clc;,,;;,c0MMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMW0c,;lOKKKxcdKWWWKo::xOlccccldlcllooccc::cddc;::;lKW0l;;:lkXWWWWKo:;cd0K0x:,,;dNMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWW0c:kOoccc;;ckXWWNOdolcccldkdccclxo;::;;dXKl;::;:xNXdcd0NWWWN0dc;;;;;:dK0l,;oKWMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMW0l:;,;;;;coxdxKNWWXOxollooc::cxx:;:;lx0Nkc;;;::oO00XWWWX0xl:;oOxl;;;;::;;dXWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWKl;;,;lk00kocldkKNWWNX0OxdolodlccccldxxdodxkOKXNNXKOxoll:;;;:kNKl;;,,;lONWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMXd;;dK0d:;:cclxkxdxkO0KKKKKK000OOOOOOO00K00Okxdlc:;;;dKKd;;,cOXx;,:oONWWMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMNklddlc:;:cxKKkl;;;;cddlcclodolccc:cooc:::;:l:;;;;;;cOWKl,;;:cclxKNWMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWWKdccc:;:kKkc;;;;:dKKx:;;;dXk:;;;;:kKd;;;;cOOc;;;;;;d0Oc,:ldkKWWWWMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWWWN0dc;,ckd;;;;;;c0Xo;;;;;kWO:;;;;c0Nx;;;;:kKo;;;,;;:loxOKNWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWWWWWWWMMWWKxlcc;,,,,;,:kx:,;;,;oOo;;;;;lOkc;;;::lollodxkOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWWWWWMMMMMMMMMMMWX0OkxddddoddddxxxkkOOOOO00O00O000KKKXNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWMMMMMMMMMMMMMMMMMWWMMMWWMMMMMMMWMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN00KXKKKXXKKK00KXXKKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNX0OOOkOOkOxxkkxx0OkOKNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKKKKXX000000K0KK0KXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
					"");
			break;
		case 10:
			System.out.println(" _   _                     \r\n" + 
							   "| | | | ___  _ __ ___  ___ \r\n" + 
							   "| |_| |/ _ \\| '__/ __|/ _ \\\r\n" + 
							   "|  _  | (_) | |  \\__ \\  __/\r\n" + 
							   "|_| |_|\\___/|_|  |___/\\___|\r\n" + 
						       "");
			System.out.println("Traits: virile, easygoing, witty, honest, and outspoken.\r\n");
			
			System.out.println("Disabilities: impatient, impulsive, and self-centered.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKKXKkdolodOK0o:cOk;oKd;dNKkXWNNWMMMMMMMMMMWMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOkddxxk000xlckOl,ld:cd:;kNdc0XdxNNKNMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOdxkkO00Oxxooxdoodl::c;;;;dXOoOXdl0XdoKXOKNMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0OkkkxkOOOkl;oKXXXX0xc;;;;locdOddK0ol0Ko;:OWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKkxxxxxkkO0xc;;dXOlldOXKxc;;;;;;;cxxcl0Ko,;oXMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0O00OOOOOOOd:::;oKOdkkdokXk:;;;;;;;;;;okl,:xXMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkooooolooooc:;:;c0KkKWXd:oo:;;;;:cc:::;,,,dNWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkooollcc::;::;;;;:dK0kko:;;:;;;;;lOx:clodo:ckNMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX00OOkdolc:;;;:ooc;:okd:;::::;;;;;okc;dkooxo;;xNMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKkkxdxxddlc;;::coxxdc:;::;;:;;:::;okloddl:;ll;;kWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNK0Odlloddoc:;:::;:o0Kkl:;:;;;;:;;;ckkddooddxd:,:OWWMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0OOkdoolc:::;::::::kWXOkoc;;;;::;;;cdkkO0000kc;;ckNWMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0xxxxdolcc:::::;::::dXOlokkkoc:;;;::;;:coddxxo:;:lodOXWMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOkkkkxxdl::;:;;::::;oKk:;:dNWKOxoc:;;::;;;;;;;:d0N0l;cdkKWM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOddddoolc:::::::::;:;oKk::o0WWOdxOOkxdoc:;;;;;lONNOl;;,,:xNM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOOOOOOxllc::;::::::;;dXxcxXWWXx:;:codxkOOkxocdKXkl;;;;:o0NWW\r\n" + 
							   "MMMMMMMMMMMMMMMMWWWWMMMMMMMMMMMMMMMMMMNOxkOkkxdol:::::;:::::;dX00WWXxd0kl:;:;;:cldxkOXXo;;;;;l0NWWWW\r\n" + 
							   "MMMMMMMMMMMMWX0xdoodkKWMMMMMMMMMMMMMMWKkxddooollc::::;:::::;:xNWWXOl::cxOkxddoc::;;;cdo::dkOOKWWWMMM\r\n" + 
							   "MMMMMMMMWWN0dodxxxxdlld0WMMMMMMMMMMMMWOdddddllc:::::;;:::;:lkXWXkl:::;:::ldxxdldOOOOkoc:lkKNMWWWMMMM\r\n" + 
							   "MMMMMMMMWKolxOkdddxOK0dcdKWMMMMMMMMMMMWWWWWWXOoc::;;:;;:lxOKKOdc;;;;;;;:;;;;;;;dNWMMWNKkddkXWWMMMMMM\r\n" + 
							   "MMMMMMMMKllOkloxxxdddk0d;ckNWWMMMMMMMMMMMMWXkc;:clooddddk0kocloddddxxkkOOOkxxdookOOO0NWWWNWWMMMMMMMM\r\n" + 
							   "MMMMMMMWxlkxck0xxxxxxoll:;:o0NWMMMMMMMMMMMWKxxO0XNWWWWWWWXd::lxxxxxxxxxxxxkOKNNKkkOkdONWWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWxoxcdKxkkxxoc:::::;:cokKNWMMMMMMMMMMMMWWMMMMMMWX0d:;:ccclllllodddxkkkkOKKOOOoxNWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWkc:cOOk0l;;;;::;::;:::;coxk0XNWWWMMMMMMWNXK0kxkOko:;:odxkxxkkxxddoololcdOOOxcoKWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMKl,c0Ox0l;:;:;;;::;coxddxc;:cloodddxddxdol:lxclKWXd:::cclc:cccldxkxoxOl;::lddoOWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWk;c0ko0x;;:cc::;:odx0XK0xdl::::;:dkdlclddodxoo0WWXo:ccclcclccoxO0XXKKOxc;:kNWWWWMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWKlc0klOOoldKKd:;cdk0NWWXOxl;::;;:xNWNkooocdxood0WW0lcccccllcdO0KNWWNOdl:;;okkxk0XWMMMMMMMMM\r\n" + 
							   "MMMMMMMMM0cc0kckOkkxXXd;:okxOXWX0Oxo:;::;;c0WM0lodloxxod0NWXdcccc:okocxOkOXOkkdl:;;;;;;;;l0WMMMMMMMM\r\n" + 
							   "MMMMMMMMM0c:0Ock0Okd0Oc;:lccOOO0kxdl:;:oo:;dNWXkxkkkxkkxxKWNkc:::;l0x;od:cxxl:cc:;:oo:;;;;dNMMMMMMMM\r\n" + 
							   "MMMMMMMMM0c:kkck0Oklkd;:;;;cxocdko:;:;:xk:;lKWKdcccccccclOWWk:;;:;l0d;:::;;:::::;:d0d:;;;;dNMMMMMMMM\r\n" + 
							   "MMMMMMMMM0c;lc:k00kcxo;:;::;::;;;;:;;::kkc:oKWKdddxxxxxkkKWNx:;;;;o0d;:;;;;;::;:;lOd;;;;;cOWMMMMMMMM\r\n" + 
							   "MMMMMMMMWk:ll,:kKKkcxd;:;;:;;:::;::;;:lOklcdKX0OOkx0XOxkkkxdc::;::lxl;;;:;;;;;;;:dx:;;;;:kNMMMMMMMMM\r\n" + 
							   "MMMMMMMW0ccxl,cOKKklOk:;;;;;;::;:cccccx0dcllolcc:;;dKd;;;;;;:;::;:;:::;;;;;;;;;;:c:;;;;;dNMMMMMMMMMM\r\n" + 
							   "MMMMMMMXo;xk:,oKO0xoXKl;;;;;:c:::clccd0kcccc:::cllokXOoooc:;;:::;:ldl;:;;;;;;;;;;;;;;;,lKWMMMMMMMMMM\r\n" + 
							   "MMMMMWXd:d0o,:O0x0dxWWOc;;;:cccccccok0xc:::;;;l0KKKKK0OKNkc;;;:ldOXXd;;;;;;;;;;;;;;;;;;xWWMMMMMMMMMM\r\n" + 
							   "MMMMWKl:xKd;;dKdd0dkWMNx::ccccccclxOkllddooolcoOOkkkkkkO0xlldx0XWWWNx;;;;;;;;;;;lxkkklcOWMMMMMMMMMMM\r\n" + 
							   "MMMWOccOKd;;oKk:x0d0MWWKl:ccccccldxl:;cOWWWNNXK0OkkkOO0KKKXNWWMMMMMWk:;;;;;;;;;ckKKXNxlKMMMMMMMMMMMM\r\n" + 
							   "MMMKooKXxlccxx:c0OdXMWWNx:cc:c:;::;;;;;dNMMMMMMMMMMMMMMMMMMMMMMMMMMWk:;;;;;;;;;;cooddokNWMMMMMMMMMMM\r\n" + 
							   "MMMWNWMWWNXXK0kOKkkWWWMWx::;;;;;;;;;;;;dNMMMMMMMMMMMMMMMMMMMMMMMMMMWx;;;;;;;;;;;xNWNNNWWMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMWMWWWWNWMMWWNd,;;;;;;;;;;;;lKWMMMMMMMMMMMMMMMMMMMMMMMMMMNo;;;,;;,;,,;kWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMWWWWWWWMMMMMMNo,,,,,;;;;;;;:kWMMMMMMMMMMMMMMMMMMMMMMMMMMW0c;cddddxxo:;kWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMWWWWWWMMMMMMMMMMKdoxxxxkkOOkc;xNMMMMMMMMMMMMMMMMMMMMMMMMMMMXo;;lkkO0K0x:;kWMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMWWWMMMMMMMMMMMM0xKX0OkkOOOxcc0WMMMMMMMMMMMMMMMMMMMMMMMMMMWXOkOO0000Ol;:oKMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWX0KK00OO00OkdkNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNK0KNWWWWWWWWWWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNX0KK0KKKXKKKKKKXKKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNKkOOxkOOkkx00kkkkO0XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKXXKK00KK0XX000KKXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
		case 11:
			System.out.println("  ____             _   \r\n" + 
							   " / ___| ___   __ _| |_ \r\n" + 
							   "| |  _ / _ \\ / _` | __|\r\n" + 
							   "| |_| | (_) | (_| | |_ \r\n" + 
							   " \\____|\\___/ \\__,_|\\__|\r\n" + 
						       "");
			System.out.println("Traits: intelligent, romantic, charming, compassionate, and gentle.\r\n");
			
			System.out.println("Disabilities: disorganized, lazy, pessimistic, timid, indecisive, anxious, and gullible.\r\n");
			
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXK0kxxxxkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMWWWNKOxdlccoxOXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMWNKkddxdc:okKWMMMMMMMWMMWMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMWXklllcokkkKNWNK00OOOOkddddxxkkkkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMWKdccoddlcxKX0kdlldxccxkxdxO0KXXXNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWWNklloddo:oOkoc:lodlcdddOXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMWXxcldxxl:ddlclodolldx0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMWXd:oxxdcclllodol:ldOXWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMWWWOloddxo:::clllolcdO00000000NMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMXOxxxocc:;::;;;;;;;;;::cloxdllxONMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMN0kdc;;;;;;;;;;;;;;:;:xKXKkoxXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMM\r\n" + 
							   "MMMMMMMMMMMMWN0l;;;;;;;;;;;;;;:;:x0kl::okKNWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0OXWWMWWMWWMMM\r\n" + 
							   "MMMMMMMMMMWXko:;;;;;;;;;;;;;;;;:;:::::::::oxOKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXoclkNWWWWWMMMM\r\n" + 
							   "MMMMMMMWN0dc;:coddo:;;;;;;;;;;::;;::;:::::;;:cox0XNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWN0ldkoxOKWMMMMMM\r\n" + 
							   "MMMMMWXkl:cdkOO0Okdc;;;;;;;;;;;:::::::;:c:lxl:clcclodxO0XNWWMMMMMMMMMMMMMMMMMMMWX0OkdloKXkc;dNWWMMMM\r\n" + 
							   "MMMMW0l;;oK0xkdodc;;;;;;;;::;;:;;;;;:lddl:lxl:dOOOOkxdolllodxkO0KXXNNWWWWWWNXKOoc:cclxKWWN0ldNMMMMMM\r\n" + 
							   "MMMNk:,;;clclO0k0Ol;;;:;;::;::;:oxkdxKklodc:ll::cxKXWWNXK0OkxdooooooodddxdxddxxxkOO0XNMMMMKllKWMMMMM\r\n" + 
							   "MMWk:;;;;;;;cdxddl:;;:;;;;;::::ldKWNKklckkclK0dc;lkKWMMMMMMMWWWNNXKKkdk000KXNNWWWMMMMMMMMMNxckWMMMMM\r\n" + 
							   "MWk:,;;;;;;;;;;;;:;;;;;:;;;:cclONNNkccl:coxO0XNxcxXNMMMWWN0OXWWMMWWNOd0WWWWWWWMMMMMMMMMMMWNxoKMMMMMM\r\n" + 
							   "Wk:,,;;;;;;;;;;;;;:;;:;;;;;lOKXKkxoccddcxXkc:xNXKNMMMMMMWXkxK0kOKNWMXkkXWWMWXXWMMMMMMMMWNKxxKWMMMMMM\r\n" + 
							   "NOl;;;;;;;;;;;;;;;;:;;;:::;lKWOccdo:cdx0NNx:;xNWWMMMMMWNNNXXNKOxoxKWWklOWMNKxdKWMMMMMMW0o:c0WWMMMMMM\r\n" + 
							   "MWk:;;;;;;;;;;:cllooddxdc;;cddc;d0x:dKOkXW0cc0WWMMMMMWKx0OdddxOK0odXKooKWXkkXNWMMMMMMMWk:;:OWMMMMMMM\r\n" + 
							   "MWXK00kl;;;;;lOKXNWWWWWk:;cdxl::lddkXO:;dXNO0WMWMMWWWWNXNNXK0Oxd0K0X0xkkdod0WMMMMMMMMMW0c;c0WWMMMMMM\r\n" + 
							   "MMMMMMWx;;;;lKWWWMMMMWXo::cdko:dKXNWWOc;oXWMMMMMMWWWWWWWNKOkkk0K0kxOXXkx0XNXKXX0KWMMMMMKl;lKMMMMMMMM\r\n" + 
							   "MMMMMMWk:;;:xWMMMMMMWNk:;::;:dkOxldXNx:l0WMMWWMWWWWWWWNOolodddxXXOkOK0xoddollO0okNMMMMMNd;lXWMMMMMMM\r\n" + 
							   "MMMMMMWk:;;lKMMMMMWNkodoc;:::kXk:;oKN00XWWWWMWWMWWMWN0OOOKKkdxOKKXXKklodxkO0XWWNWMMMMMMWO:lKMMMMMMMM\r\n" + 
							   "MMMMMMWk:;c0WMMMMWXdokOkd:lxclX0oo0WWMWWWWMWWMMMWMMMXkONNOloONWOlk0loxocldkXX0NWMMMMMMMWO:cKMMMMMMMM\r\n" + 
							   "MMMMMMXo:dKWMMMMMWklkkxxc:kk:oXWNWWWMWWMWWWMMMMMMMMMMWMW0oxXWMNdc0Xx:lk000KNkl0WMMMMMMMWk;lKMMMMMMMM\r\n" + 
							   "MMMMMW0k0WWMMMMMMNdokOxclxxcl0WWWWWWWMWWMMMMMMMMMMMMMMMKodXWWMNxlOWNOooO0OXWNXNMMMMMMMMNd;dNMMMMMMMM\r\n" + 
							   "MMMMMWWWWMMMMMMMMWOoodo:lolcoONWWWWWWMMMMMMMMMMMMMMMMMMXOONMMMWNOdxOXNNKockNMMMMMMMMMMMKl;kWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWk::okOdlccldkXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOdxXMNXXXNWMMMMMMMMMMM0c:OWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMXOONXxccloc::lkXWMMMMMMWMNK00KNWWWWWWMMWWMMWMMWWMMMNOkNWWMMMMMMMMMMM0c;kWMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMWWWWXxcccoOd:;;:kWMMMMMMWXd:::clodkOkdOK0xkXKk0XWWWWWXxoONWMMMMMMMMMMNd;lKMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMWWWWWWWNkc::;cOOc;;:kWMMMMMMNx::lolccc::c::cc::cc;;codddddl::lk0NWMMMMMMMW0c;xNMMMMMMM\r\n" + 
							   "MMMMMMMMMMMWWWWWWWWMMKl;:;;:kOc;;:OWMMMMMM0c;oKNNXXKK0OOkkxxxxxxo:;::;;:;;;;::lkKWMMMMMMNk;cKMMMMMMM\r\n" + 
							   "MMMMMMMMWWWWWWMMMMMMMNkc;;;:xkc;;oXMMMMMMNd;:kWMMMMMMMMMMMMMMMWWKl;::;;:;;::::;;ckNMMMMMMKl;kWMMMMMM\r\n" + 
							   "MMMMMMWWWMMMMMMMMMMMMMWKdc;:dd:;:kWMMMMMWOc;oKMMMMMMMMMMMMMMMMWWOc;;;;;:;;;;:l:;;:kWMMMMMXo,xNMMMMMM\r\n" + 
							   "MMMWWWWMMMMMMMMMMMMMMMMWWKd:::;;dXMMMMMWKo;l0WMMMMMMMMMMMMMMMWWKo;;;;;;:;;;:xKd;;;lXMMMMWO:;kWMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMNOc;;l0WMMMMWXd;l0WMMMMMMMMMMMMMMMMWKo:;;;;;;;;;:xXNd;;;lKMMMWKl,lKMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMW0c;cOWMMMMWNx:l0WMMMMMMMMMMMMMMMMWKo:;;;::;;;;cONXx:;;:xNMMWKo,:OWMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMMKo;:xNWWMWWKx:cONMMMMMMMMMMMMMMMMWXo;;;;;;;;;:dKNOl;;;ckXWWN0l;l0WMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMWWk:;:oxxxxdoc;:OWWMMMMMMMMMMMMMMMWXo;;;;;;;;cd0NXx:;;;;:llool;;xXWMMMMMMMMM\r\n" + 
							   "MMMMMMMMMMMMMMMMMMMMMMMMMWk::clllllllloONMMMMMMMMMMMMMMMMMWKkxxkkkOO0XWMWKdloooooooodddONWMMMMMMMMMM\r\n" + 
							   "WWWWWWWWWWWWWWWWWWWWWWWWWWXKKXXXXNNNNXNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNNNNNNWNWWWNWWWWWWWWWWW\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKKXNNNNNNNXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN0O000000KK0OOOXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNK00OO0000OOO00XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXNNXNNNNXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\r\n" + 
							   "");
			break;
			
		}
	}

}
