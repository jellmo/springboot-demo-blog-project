package com.mohe.blog.dao;

import com.mohe.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 评论实例dao层
 *
 * @author mo
 */
public interface CommentRepository extends JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
