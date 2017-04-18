public class TVGuide{
  public static void main (String[] args){

    int [] channels = {2,4,5,7,9,11};
    String [] networks = {"CBS", "NBC", "FOX", "ABC", "MY9", "CW"};
    boolean isChannel = false;
    System.out.println("Enter channel to find the network name: ");
    int ch = IO.readInt();

    //error check for the channel
    /*
      while (isChannel == false){
      for (int i = 0; i < channels.length; i++){
        if (channels[i] == ch){
          isChannel = true;
          break;
        }
      }
      if (isChannel == true){
        break;
      } else {
        System.out.println("This is not a channel. Try again.");
        ch = IO.readInt();
      }
    }
    */

    //find network when given channel
    System.out.println("The network name is: ");
    System.out.println(networkLookup(channels,networks,ch));

    System.out.println("Enter network to find the channel name: ");
    String net = IO.readString();

    /*
    boolean isNetwork = false;
    while (isNetwork == false){
      for (int i = 0; i < networks.length; i++){
        if (networks[i].equals(net)){
          isNetwork = true;
          break;
        }
      }
      if (isNetwork == true){
        break;
      } else {
        System.out.println("This is not a network. Try again.");
        net = IO.readString();
      }
    }
    */
    System.out.println("The channel number is: ");
    System.out.println(channelLookup(channels,networks,net));

  }

  //with the channel, give back network name
  public static String networkLookup(int[] chan, String[] net, int ch){
    int index = -1;
    for (int i = 0; i < chan.length; i++){
      if (chan[i] == ch){
        index = i;
        break;
      }
    }

    if (index != -1){
      return net[index];
    } else {
      return "Channel does not exist!";
    }


  }

  //with network, give channel back
  public static int channelLookup(int[] chan, String[] netlist, String net){
    int index = -1;
    for (int i = 0; i < netlist.length; i++){
      if (netlist[i].equalsIgnoreCase(net)){
        index = i;
        break;
      }
    }

    if (index != -1){
      return chan[index];
    } else {
      return index; //error
    }
  }



}
