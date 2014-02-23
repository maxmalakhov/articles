public class MySpringController {
	@Autowired
	MySpringService service;

	@MappingHandling(method=RequestMethodType.POST, consume=ApplicationType.JSON, produce=ApplicationType.JSON)
	@ResponseBody
	public void ResponseBodyWrapper save(@Valid @RequestBody DataDto data) {

	}
}