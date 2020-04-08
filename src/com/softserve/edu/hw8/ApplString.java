package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplString {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		String example = "\"html_url\": \"https://github.com/dotnet/BenchmarkDotNet\",\r\n"
				+ "    \"description\": \"Powerful .NET library for benchmarking\",\r\n" + "    \"fork\": false,\r\n"
				+ "    \"url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet\",\r\n"
				+ "    \"forks_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/forks\",\r\n"
				+ "    \"keys_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/keys{/key_id}\",\r\n"
				+ "    \"collaborators_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/collaborators{/collaborator}\",\r\n"
				+ "    \"teams_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/teams\",\r\n"
				+ "    \"hooks_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/hooks\",\r\n"
				+ "    \"issue_events_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/issues/events{/number}\",\r\n"
				+ "    \"events_url\": \"https://api.github.com/repos/dotnet/BenchmarkDotNet/events\",";
//		Pattern pattern = Pattern.compile("(?:\\\"|\\')([^\"]*)(?:\\\"|\\')(?=:)(?:\\:\\s)(?:\\\")?(true|false|[0-9a-zA-Z()\\@\\:\\,\\/!+-.\\$\\ \\\\\\']*)(?:\\\")?");
		Pattern pattern = Pattern.compile("\"([^\"]+)\":\"?([^\",}]+)\"?");
		Matcher matcher = pattern.matcher(example);
		while (matcher.find()) {
			map.put(matcher.group(1), matcher.group(2));
		}
		System.out.println("new map " + map);
		System.out.println("new map " + map.size());

	}
}
