package com.junjun.myblog.domain;

import java.util.Date;

/**
 * 博客实体类
 * 
 * @author jun
 *
 */
public class Blog {

	private Integer id;// 博客id
	private String title;// 博客标题
	private String summary;// 博客摘要
	private String content;// 博客内容
	private Date releaseDate;// 发布时间
	private Integer clickHit;// 点击数
	private Integer replyHit;// 回复数
	private String keyword;// 关键字

	// 数据库中没有的字段
	private BlogType blogType;// 对应博客类型，关联查询
	private Integer blogReleaseCount;// 按发布时间计数的博客数量
	private String releaseDateStr;// 显示在页面的日期字符串

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getClickHit() {
		return clickHit;
	}

	public void setClickHit(Integer clickHit) {
		this.clickHit = clickHit;
	}

	public Integer getReplyHit() {
		return replyHit;
	}

	public void setReplyHit(Integer replyHit) {
		this.replyHit = replyHit;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public BlogType getBlogType() {
		return blogType;
	}

	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}

	public Integer getBlogReleaseCount() {
		return blogReleaseCount;
	}

	public void setBlogReleaseCount(Integer blogReleaseCount) {
		this.blogReleaseCount = blogReleaseCount;
	}

	public String getReleaseDateStr() {
		return releaseDateStr;
	}

	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", summary=" + summary + ", releaseDate=" + releaseDate
				+ ", clickHit=" + clickHit + ", replyHit=" + replyHit + ", keyword=" + keyword + ", blogType="
				+ blogType + ", blogReleaseCount=" + blogReleaseCount + ", releaseDateStr=" + releaseDateStr + "]";
	}

	


	
	
	

}
