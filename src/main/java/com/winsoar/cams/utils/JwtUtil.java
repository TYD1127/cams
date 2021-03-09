package com.winsoar.cams.utils;


import com.winsoar.cams.pojo.User;
import io.jsonwebtoken.*;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author TangYaD
 * @Date 2021/1/4 17:39
 * @Version 1.0
 */
public class JwtUtil {
    /**过期时间---24 hour*/
    private static final int EXPIRATION_TIME = 60*60*12;
    /**自己设定的秘钥*/
    private static final String SECRET = "TangYaDong";
    /**前缀*/
    public static final String TOKEN_PREFIX = "Bearer ";
    /**表头授权*/
    public static final String AUTHORIZATION = "Authorization";

    /**
     * 功能描述:创建Token
     */
    public static String generateToken(User user) {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        // 设置签发时间
        calendar.setTime(new Date());
        // 设置过期时间
        // 添加秒钟
        calendar.add(Calendar.SECOND, EXPIRATION_TIME);
        Date time = calendar.getTime();
        HashMap<String, Object> map = new HashMap<>();
        //you can put any data in the map
        map.put("userName", user.getUsername());
        map.put("Account", user.getAccount());
        String jwt = Jwts.builder()
                .setClaims(map)
                //签发时间
                .setIssuedAt(now)
                //过期时间
                .setExpiration(time)
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
        //jwt前面一般都会加Bearer
        return TOKEN_PREFIX + jwt;
    }
    /**
     *
     * @author: TYD
     * 功能描述: 解密Token
     * @date: 2020/12/28 16:18
     * @param:
     * @return:
     */
    public static String validateToken(String token) {
        try {
            // parse the token.
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody();
            String userName = body.get("userName").toString();
            return userName;
        }catch (ExpiredJwtException e) {
            throw e;
        } catch (UnsupportedJwtException e) {
            throw e;
        } catch (MalformedJwtException e) {
            throw e;
        } catch (SignatureException e) {
            throw e;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e){
            throw e;
        }
    }
}
