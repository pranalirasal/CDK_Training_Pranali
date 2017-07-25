import java.lang.annotation.*;

@Retention (RetentionPolicy.CLASS)
@Target (ElementType.TYPE)
@interface Company {
	String name();
	String location();
}