package in.efoundry.constants


object Constants { 
  val OLD_BOOKING_CODE = "old_booking_code".intern()
  val ACTION = "action".intern()
  val EDIT = "edit".intern()
  val ADD = "add".intern()
  val GUEST = "guest".intern()
  val ADMIN = "admin".intern()
  val USER = "user".intern()
  val EMPLOYEE = "employee".intern()
  val VERSION1 = "1".intern()
  val VERSION2 = "2".intern()
  val VERSION3 = "3".intern()
  val USER_EMAIL = "user_email".intern()
  val USER_NAME = "user_name".intern()
  val USER_ROLE = "user_role".intern()
  val SHOW_SINGLE_HOTEL = "show_single_hotel".intern()
  val ROLE = "role".intern()
  val NULLSTRING = "".intern()
  val SINGLE_SPACE = " ".intern()
  val ERROR = "error".intern()
  val SUCCESS = "success".intern()
  val WARNING = "warning".intern()
  val MULTIPLE_SPACES_REGEX = """\s+""".intern()
  val DONE = "Done".intern()
  val INPROGRESS = "In-Progress".intern()
  val ONE = "1".intern()
  val DATE = "date".intern()
  val ACCOUNT_TYPE = "account_type".intern()
  val LOGIN_TYPE = "login_type".intern()
  val NORMAL_LOGIN  = "normal".intern()
  val NETWORK_LOGIN = "network".intern()
  val GROUP_TYPE = "group_type".intern()
  val INDIVIDUAL_GROUP_TYPE = "individual".intern()
  val GROUP_GROUP_TYPE = "group".intern()
  val AT_THE_RATE = "@".intern()
  val OTHERS_SMALL_LETTERS = "others".intern()
  val LAST_LOGIN = "Login".intern()
  val HASH = "#".intern()
  val HOTEL = "hotel".intern()
  val CHAIN = "chain".intern()
  val ACCESS_LEVEL = "access_level".intern()
  val CURRENT_HOTEL_ID = "currentHotelID".intern()
  val IP_ADDRESS = "ip".intern()
  val USER_IP = "user_ip".intern()
  
  val promoCode = java.util.UUID.randomUUID().toString.replaceAll("-","").substring(0,8)
}