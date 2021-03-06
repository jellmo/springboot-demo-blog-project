package com.mohe.blog.service;

import com.mohe.blog.po.Comment;

import java.util.List;

public interface CommentService  {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
