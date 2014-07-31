package com.apress.pss.terrormovies.security;

import org.springframework.security.access.expression.AbstractSecurityExpressionHandler;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;

/**
 * Created by john on 14-7-31.
 */
public class CustomWebSecurityExpressionHandler extends AbstractSecurityExpressionHandler<FilterInvocation> {

    @Override
    protected CustomWebSecurityExpressionRoot createSecurityExpressionRoot(
            Authentication authentication, FilterInvocation filterInvocation) {
        CustomWebSecurityExpressionRoot root =
          new CustomWebSecurityExpressionRoot(authentication, filterInvocation);
        root.setPermissionEvaluator(getPermissionEvaluator());
        root.setTrustResolver(new AuthenticationTrustResolverImpl());
        return root;
    }
}
