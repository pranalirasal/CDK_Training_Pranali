import java.lang.annotation.*;

@Retention (RetentionPolicy.SOURCE)
@Target ({ElementType.TYPE, ElementType.METHOD})
@interface TimeStamp {
	Day day();
	Month month();
	Year year();
}